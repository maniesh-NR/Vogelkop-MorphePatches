package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class mh2 {
    public static final mh2 a = new mh2();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mh2);
    }

    public final int hashCode() {
        return Objects.hash(0, -1, -1, 0, -1);
    }

    public final String toString() {
        return "AudioSpec{bitrate=0, sourceFormat=-1, source=-1, sampleRate=0, channelCount=-1, mimeType=audio/*}";
    }
}
