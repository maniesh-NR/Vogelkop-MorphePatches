package androidx.media;

import defpackage.e2n;
import defpackage.g2n;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(e2n e2nVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        g2n g2nVarH = audioAttributesCompat.a;
        if (e2nVar.e(1)) {
            g2nVarH = e2nVar.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) g2nVarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, e2n e2nVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        e2nVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        e2nVar.i(1);
        e2nVar.l(audioAttributesImpl);
    }
}
