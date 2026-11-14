package androidx.media;

import android.media.AudioAttributes;
import defpackage.e2n;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(e2n e2nVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) e2nVar.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = e2nVar.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, e2n e2nVar) {
        e2nVar.getClass();
        e2nVar.k(audioAttributesImplApi26.a, 1);
        e2nVar.j(audioAttributesImplApi26.b, 2);
    }
}
