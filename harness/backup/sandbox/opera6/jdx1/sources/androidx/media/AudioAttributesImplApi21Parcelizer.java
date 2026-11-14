package androidx.media;

import android.media.AudioAttributes;
import defpackage.e2n;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(e2n e2nVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) e2nVar.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = e2nVar.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, e2n e2nVar) {
        e2nVar.getClass();
        e2nVar.k(audioAttributesImplApi21.a, 1);
        e2nVar.j(audioAttributesImplApi21.b, 2);
    }
}
