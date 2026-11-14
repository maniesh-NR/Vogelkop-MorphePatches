package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class f20 implements ed6 {
    public final ed6 a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public f20(ed6 ed6Var, byte[] bArr, byte[] bArr2) {
        this.a = ed6Var;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.ed6
    public final long b(nd6 nd6Var) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                ld6 ld6Var = new ld6(this.a, nd6Var);
                this.d = new CipherInputStream(ld6Var, cipher);
                ld6Var.h();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                rqd.p(e);
                return 0L;
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            rqd.p(e2);
            return 0L;
        }
    }

    @Override // defpackage.ed6
    public final void c(pl6 pl6Var) {
        pl6Var.getClass();
        this.a.c(pl6Var);
    }

    @Override // defpackage.ed6
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override // defpackage.ed6
    public final Map getResponseHeaders() {
        return this.a.getResponseHeaders();
    }

    @Override // defpackage.ed6
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.oc6
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.d.getClass();
        int i3 = this.d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
