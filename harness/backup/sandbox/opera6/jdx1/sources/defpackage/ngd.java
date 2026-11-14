package defpackage;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public class ngd extends oj6 {
    public final int a;

    public ngd(IllegalStateException illegalStateException, ogd ogdVar) {
        int errorCode;
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(ogdVar == null ? null : ogdVar.a);
        super(sb.toString(), illegalStateException);
        if (illegalStateException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) illegalStateException;
            codecException.getDiagnosticInfo();
            errorCode = codecException.getErrorCode();
        } else {
            errorCode = 0;
        }
        this.a = errorCode;
    }
}
