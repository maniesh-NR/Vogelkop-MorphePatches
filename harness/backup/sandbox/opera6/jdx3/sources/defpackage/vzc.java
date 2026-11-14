package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class vzc implements esk {
    public final byte[] a;
    public SecretKeySpec b;
    public final /* synthetic */ g0d c;

    public vzc(g0d g0dVar, byte[] bArr) {
        this.c = g0dVar;
        this.a = bArr;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Key get() throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (this.b == null) {
            g0d g0dVar = this.c;
            byte[] bArrA = g0dVar.b.a(this.a);
            if (bArrA == null) {
                return null;
            }
            SecureRandom secureRandom = q36.a;
            m36[] m36VarArr = m36.a;
            if (n36.a[0] != 1) {
                h9o.p();
                return null;
            }
            this.b = q36.a(bArrA.length << 3) ? new SecretKeySpec(bArrA, "AES") : null;
            new rml(Unit.a, g0dVar.a).a(new rkc((Object) this, (byte) 10)).q(g0d.g);
        }
        return this.b;
    }
}
