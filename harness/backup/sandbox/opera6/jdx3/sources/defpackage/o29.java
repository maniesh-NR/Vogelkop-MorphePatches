package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum o29 {
    AUDIO(0),
    AUDIO_PLAYLIST(1),
    VIDEO(2),
    VIDEO_STREAM_DASH(3),
    VIDEO_STREAM_HLS(4),
    APP(5),
    TEXT(6),
    HTML(7),
    PDF(8),
    IMAGE(9),
    ARCHIVE(10),
    MHTML(11),
    DOCUMENT(12),
    NONE(13),
    VIDEO_OR_AUDIO(14);

    public final csh a;

    o29(int i) {
        scd.q(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int length = strArr.length;
        c09.e(length, strArr);
        int iB = w0b.b(4, length);
        objArrCopyOf = iB > 4 ? Arrays.copyOf(objArrCopyOf, iB) : objArrCopyOf;
        System.arraycopy(strArr, 0, objArrCopyOf, 0, length);
        this.a = h1b.o(length, objArrCopyOf);
    }

    public final boolean d() {
        int iOrdinal = ordinal();
        return iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4;
    }
}
