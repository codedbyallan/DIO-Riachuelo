package others;

import java.util.Locale;

public class BenchConcat {
    static final int N = 1_000_000;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.printf("Java: %s | N: %,d | MaxMemory: %.1f MB%n",
                System.getProperty("java.version"),
                N,
                Runtime.getRuntime().maxMemory() / (1024.0 * 1024.0));

        // ---- Warm-up (aquecimento) para JIT ----
        warmUp();

        // ---- String (ingênuo) ----
        Result rString = time("String (+)", BenchConcat::runString);
        print(rString);

        // ---- StringBuilder (single-thread) ----
        Result rBuilder = time("StringBuilder", BenchConcat::runBuilder);
        print(rBuilder);

        // ---- StringBuffer (thread-safe) ----
        Result rBuffer = time("StringBuffer", BenchConcat::runBuffer);
        print(rBuffer);
    }

    // ----- Testes -----

    private static Result runString() {
        String s = "";
        for (int i = 0; i < N; i++) {
            s += i; // cria objeto novo a cada passo
        }
        return new Result("String (+)", s.length(), s.hashCode());
    }

    private static Result runBuilder() {
        // estimativa do tamanho final: dígitos de 0..999_999 = 5_888_890
        StringBuilder sb = new StringBuilder(5_900_000);
        for (int i = 0; i < N; i++) {
            sb.append(i);
        }
        String s = sb.toString();
        return new Result("StringBuilder", s.length(), s.hashCode());
    }

    private static Result runBuffer() {
        StringBuffer sb = new StringBuffer(5_900_000);
        for (int i = 0; i < N; i++) {
            sb.append(i);
        }
        String s = sb.toString();
        return new Result("StringBuffer", s.length(), s.hashCode());
    }

    // ----- Infra de medição -----

    private static void warmUp() {
        for (int k = 0; k < 3; k++) {
            StringBuilder sb = new StringBuilder(600_000);
            for (int i = 0; i < 100_000; i++) sb.append(i);
            sb.toString().hashCode();
        }
    }

    private static Result time(String name, SupplierWithResult f) {
        System.gc(); // (melhora repetibilidade; pode ignorar)
        long t0 = System.nanoTime();
        Result r = f.get();
        long t1 = System.nanoTime();
        r.ms = (t1 - t0) / 1_000_000.0;
        return r;
    }

    private static void print(Result r) {
        System.out.printf("%-14s | time = %8.1f ms | length = %,d | hash = %d%n",
                r.name, r.ms, r.length, r.hash);
    }

    // ----- Tipos auxiliares -----

    interface SupplierWithResult { Result get(); }

    static class Result {
        final String name;
        final int length;
        final int hash;
        double ms;
        Result(String name, int length, int hash) {
            this.name = name;
            this.length = length;
            this.hash = hash;
        }
    }
}
