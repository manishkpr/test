package com.example.jni_debug_demo;

public class SquaredWrapper {
    // Declare native method (and make it public to expose it directly)
    public static native int squared(int base);
     
    // Provide additional functionality, that &quot;extends&quot; the native method
    public static int to4(int base)
    {
        int sq = squared(base);
        return squared(sq);
    }
     
    // Load library
    static {
        System.loadLibrary("squared");
    }
}
