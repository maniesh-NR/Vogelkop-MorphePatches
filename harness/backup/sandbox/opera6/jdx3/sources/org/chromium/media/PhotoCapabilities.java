package org.chromium.media;

/* loaded from: classes.dex */
public final class PhotoCapabilities {
    public boolean[] a;
    public double[] b;
    public int[] c;
    public int[] d;
    public int[] e;
    public int[][] f;

    public final boolean getBool(int i) {
        if (i >= 0 && i < 3) {
            return this.a[i];
        }
        hai.d();
        return false;
    }

    public final double getDouble(int i) {
        if (i >= 0 && i < 16) {
            return this.b[i];
        }
        hai.d();
        return 0.0d;
    }

    public final int[] getFillLightModeArray() {
        int[] iArr = this.d;
        return iArr != null ? (int[]) iArr.clone() : new int[0];
    }

    public final int getInt(int i) {
        if (i >= 0 && i < 16) {
            return this.c[i];
        }
        hai.d();
        return 0;
    }

    public final int getMeteringMode(int i) {
        if (i >= 0 && i < 3) {
            return this.e[i];
        }
        hai.d();
        return 0;
    }

    public final int[] getMeteringModeArray(int i) {
        if (i < 0 || i >= 3) {
            hai.d();
            return null;
        }
        int[] iArr = this.f[i];
        return iArr != null ? (int[]) iArr.clone() : new int[0];
    }
}
