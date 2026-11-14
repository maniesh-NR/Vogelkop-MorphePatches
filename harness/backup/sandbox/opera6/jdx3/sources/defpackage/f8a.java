package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public final class f8a {
    public static final f8a d;
    public static final f8a e;
    public static final f8a f;
    public static final f8a g;
    public static final f8a h;
    public static final f8a i;
    public static final f8a j;
    public static final char[] k;
    public static final char[] l;
    public final String a;
    public final v7a b;
    public final Function1 c;

    static {
        v7a v7aVar = v7a.a;
        d = new f8a("MD5", v7aVar, u91.e);
        e = new f8a("SHA1", v7aVar, u91.f);
        f = new f8a("SHA256", v7a.b, u91.g);
        g = new f8a("SHA256", v7a.d, u91.h);
        h = new f8a("SHA256", v7aVar, u91.i);
        i = new f8a("SHA512", v7a.c, u91.j);
        j = new f8a("SHA512", v7aVar, u91.k);
        k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        l = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public f8a(String str, v7a v7aVar, Function1 function1) {
        this.a = str;
        this.b = v7aVar;
        this.c = function1;
    }

    public final String a(String str) {
        return b(str.getBytes(Charsets.UTF_8));
    }

    public final String b(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(this.a);
        messageDigest.reset();
        messageDigest.update(bArr);
        return w7d.u(messageDigest, this.b);
    }
}
