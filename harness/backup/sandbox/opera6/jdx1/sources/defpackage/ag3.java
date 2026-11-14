package defpackage;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ag3 extends kq7 {
    public final boolean c;
    public final int d;
    public final byte[] e;
    public nq7 f;

    public ag3(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, ag3 ag3Var) {
        super(bigInteger, bigInteger2);
        this.c = ag3Var != null && (((kq7) ag3Var).a != null || ag3Var.c);
        this.d = ag3Var == null ? 0 : ag3Var.d + 1;
        this.e = Arrays.copyOf(bArr, bArr.length);
        if (ag3Var != null) {
            nq7 nq7VarA = ag3Var.f;
            if (nq7VarA == null) {
                nq7VarA = xij.a(((kq7) ag3Var).a);
                ag3Var.f = nq7VarA;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(nq7VarA.f(true));
                dih dihVar = new dih();
                dihVar.g(0, bArrDigest.length, bArrDigest);
                dihVar.e(0, new byte[20]);
            } catch (NoSuchAlgorithmException e) {
                h9o.s("Couldn't find a SHA-256 provider", e);
                throw null;
            }
        }
    }
}
