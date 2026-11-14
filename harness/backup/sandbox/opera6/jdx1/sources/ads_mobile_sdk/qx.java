package ads_mobile_sdk;

import defpackage.avj;
import defpackage.fep;
import defpackage.gip;
import j$.util.Collection;

/* loaded from: classes.dex */
public final class qx extends ku0 {
    private static final qx DEFAULT_INSTANCE;
    private static final djp allowedApis_converter_ = new avj((byte) 14);
    public static final int c = 1;
    private int allowedApisMemoizedSerializedSize;
    private gip allowedApis_ = qb1.e;

    static {
        qx qxVar = new qx();
        DEFAULT_INSTANCE = qxVar;
        ku0.a(qx.class, qxVar);
    }

    public static qx a(byte[] bArr) throws bj1 {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, bArr, bArr.length, ul0.a());
        ku0.a(ku0VarA);
        return (qx) ku0VarA;
    }

    public static qx r() {
        return DEFAULT_INSTANCE;
    }

    public static fep s() {
        return (fep) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"allowedApis_"});
        }
        if (iA == 3) {
            return new qx();
        }
        if (iA == 4) {
            return new fep(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(qx.class);
        }
        throw null;
    }

    public final void a(ox oxVar) {
        Collection collectionA = this.allowedApis_;
        if (!((j) collectionA).a) {
            qb1 qb1Var = (qb1) collectionA;
            collectionA = qb1Var.a(qb1Var.c << 1);
            this.allowedApis_ = collectionA;
        }
        ((qb1) collectionA).b(oxVar.getNumber());
    }

    public final int o() {
        return ((qb1) this.allowedApis_).c;
    }

    public final defpackage.hf0 p() {
        return new defpackage.hf0(this.allowedApis_, allowedApis_converter_);
    }

    public final gip q() {
        return this.allowedApis_;
    }
}
