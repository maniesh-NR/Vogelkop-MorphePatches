package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class ArgbEvaluator implements TypeEvaluator<Object> {
    private static final ArgbEvaluator sInstance = new ArgbEvaluator();

    @NonNull
    public static ArgbEvaluator getInstance() {
        return sInstance;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f2 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f3 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        return Integer.valueOf((Math.round(v0g.g(f3, f2, f, f2) * 255.0f) << 24) | (Math.round(((float) Math.pow(v0g.g(fPow4, fPow, f, fPow), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow(v0g.g(fPow5, fPow2, f, fPow2), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(v0g.g(fPow6, fPow3, f, fPow3), 0.45454545454545453d)) * 255.0f));
    }
}
