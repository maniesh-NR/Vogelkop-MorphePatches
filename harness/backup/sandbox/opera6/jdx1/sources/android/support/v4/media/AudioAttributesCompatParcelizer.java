package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import defpackage.e2n;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(e2n e2nVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(e2nVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, e2n e2nVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, e2nVar);
    }
}
