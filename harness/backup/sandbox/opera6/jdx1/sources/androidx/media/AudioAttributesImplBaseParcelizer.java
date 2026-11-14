package androidx.media;

import defpackage.e2n;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(e2n e2nVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = 0;
        audioAttributesImplBase.b = 0;
        audioAttributesImplBase.c = 0;
        audioAttributesImplBase.d = -1;
        audioAttributesImplBase.a = e2nVar.f(0, 1);
        audioAttributesImplBase.b = e2nVar.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = e2nVar.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = e2nVar.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, e2n e2nVar) {
        e2nVar.getClass();
        e2nVar.j(audioAttributesImplBase.a, 1);
        e2nVar.j(audioAttributesImplBase.b, 2);
        e2nVar.j(audioAttributesImplBase.c, 3);
        e2nVar.j(audioAttributesImplBase.d, 4);
    }
}
