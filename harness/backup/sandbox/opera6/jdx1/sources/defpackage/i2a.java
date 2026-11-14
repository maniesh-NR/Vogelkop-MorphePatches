package defpackage;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.SweepGradient;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i2a {
    public static final i2a a = new i2a();

    @NotNull
    public final LinearGradient a(long j, long j2, @NotNull long[] jArr, float[] fArr, int i) {
        return new LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), jArr, fArr, yi4.W(i));
    }

    @NotNull
    public final RadialGradient b(long j, float f, @NotNull long[] jArr, float[] fArr, int i) {
        return new RadialGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, jArr, fArr, yi4.W(i));
    }

    @NotNull
    public final SweepGradient c(long j, @NotNull long[] jArr, float[] fArr) {
        return new SweepGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), jArr, fArr);
    }
}
