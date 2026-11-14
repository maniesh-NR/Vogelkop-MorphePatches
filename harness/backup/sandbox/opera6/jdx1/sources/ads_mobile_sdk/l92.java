package ads_mobile_sdk;

import defpackage.dkp;
import defpackage.mip;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l92 implements dkp {
    public final mip a;
    public final th3 b;
    public final long c;

    public l92(mip mipVar, th3 th3Var, long j) {
        this.a = mipVar;
        this.b = th3Var;
        this.c = j;
    }

    @Override // defpackage.dkp
    public final boolean a(jl2 jl2Var) {
        th3 th3Var = this.b;
        if (jl2Var == null || jl2Var.equals(jl2.q())) {
            th3Var.b(fl0.EVENT_ID_ORCAS_VALIDATOR_UPDATE_METADATA_NOT_FOUND);
            return true;
        }
        short sP = (short) jl2Var.s().r().p();
        int iQ = jl2Var.s().r().q();
        byte[] bArrB = gs3.b();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort(sP);
        byteBufferAllocate.putInt(iQ);
        if (!Arrays.equals(byteBufferAllocate.array(), bArrB)) {
            th3Var.b(fl0.EVENT_ID_ORCAS_VALIDATOR_UPDATE_VM_VERSION_MISMATCH);
            return true;
        }
        long jP = jl2Var.s().p();
        this.a.getClass();
        boolean z = jP - System.currentTimeMillis() <= this.c;
        if (z) {
            th3Var.b(fl0.EVENT_ID_ORCAS_VALIDATOR_UPDATE_PROGRAM_ALMOST_EXPIRED);
        }
        return z;
    }

    @Override // defpackage.dkp
    public final boolean b(jl2 jl2Var) {
        th3 th3Var = this.b;
        if (jl2Var == null || jl2Var.equals(jl2.q())) {
            th3Var.b(fl0.EVENT_ID_ORCAS_VALIDATOR_INIT_METADATA_NOT_FOUND);
            return false;
        }
        short sP = (short) jl2Var.s().r().p();
        int iQ = jl2Var.s().r().q();
        byte[] bArrB = gs3.b();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putShort(sP);
        byteBufferAllocate.putInt(iQ);
        if (Arrays.equals(byteBufferAllocate.array(), bArrB)) {
            return true;
        }
        th3Var.b(fl0.EVENT_ID_ORCAS_VALIDATOR_INIT_VM_VERSION_MISMATCH);
        return false;
    }
}
