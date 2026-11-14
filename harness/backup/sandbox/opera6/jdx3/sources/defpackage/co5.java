package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/* loaded from: classes.dex */
public abstract class co5 {
    public static final Base64.Encoder a;

    static {
        Charset charset = StandardCharsets.UTF_8;
        a = Base64.getUrlEncoder();
        Base64.getUrlDecoder();
    }
}
