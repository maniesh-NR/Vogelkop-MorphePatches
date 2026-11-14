package defpackage;

import ads_mobile_sdk.cy0;
import ads_mobile_sdk.td1;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class udj extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ udj(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ udj(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ udj(mt5 mt5Var, Object obj, Object obj2, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.u = obj;
        this.v = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udj(mt5 mt5Var, Set set, hak hakVar) {
        super(2, mt5Var);
        this.t = (byte) 5;
        this.v = set;
        this.u = hakVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object o(Object obj) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        Integer num;
        Integer num2;
        List listK0;
        px5 px5Var = px5.a;
        ybh.y(obj);
        hak hakVar = (hak) this.u;
        long j = ((oqh) this.v).a;
        int i3 = 1;
        zrm zrmVar = hakVar.e;
        if (zrmVar == null) {
            hakVar.c(new gc4("Camera is not active."));
        } else {
            synchronized (hakVar.d) {
                z = j == hakVar.g;
            }
            if (z) {
                synchronized (hakVar.d) {
                    i = hakVar.h;
                    i2 = hakVar.i;
                    z2 = hakVar.j;
                    num = hakVar.k;
                    num2 = hakVar.l;
                }
                int iD = hakVar.d(i, z2, num);
                int iIntValue = num2 != null ? num2.intValue() : (i2 == 1 || i2 != 3) ? 4 : 3;
                Pair pair = new Pair(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(z4o.W(hakVar.a.b, iD)));
                CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
                ge4 ge4Var = hakVar.a.b;
                if (!z4o.S(ge4Var).contains(Integer.valueOf(iIntValue))) {
                    iIntValue = z4o.S(ge4Var).contains(4) ? 4 : z4o.S(ge4Var).contains(1) ? 1 : 0;
                }
                Pair pair2 = new Pair(key, Integer.valueOf(iIntValue));
                CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
                ge4 ge4Var2 = hakVar.a.b;
                CameraCharacteristics.Key key3 = CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES;
                int[] iArr = {0};
                ma4 ma4Var = (ma4) ge4Var2;
                Object objC = ma4Var.c(key3);
                if (objC != 0) {
                    iArr = objC;
                }
                if (!new a82(iArr, (byte) 0).contains(1)) {
                    Object objC2 = ma4Var.c(key3);
                    Object obj2 = {0};
                    if (objC2 != null) {
                        obj2 = objC2;
                    }
                    if (!new a82((int[]) obj2, (byte) 0).contains(1)) {
                        i3 = 0;
                    }
                }
                Map mapC = rbd.c(new Pair[]{pair, pair2, new Pair(key2, Integer.valueOf(i3))});
                try {
                    yrm yrmVar = yrm.a;
                    h07 h07VarM = zrmVar.m(mapC, xrm.b);
                    synchronized (hakVar.d) {
                        listK0 = CollectionsKt.k0(hakVar.f);
                    }
                    h07VarM.s(new d7k(listK0, hakVar, (byte) 4));
                } catch (Exception e) {
                    hakVar.c(e);
                }
            }
        }
        return Unit.a;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.v;
        switch (b) {
            case 0:
                udj udjVar = new udj((byte) 0, mt5Var, obj2);
                udjVar.u = obj;
                return udjVar;
            case 1:
                return new udj(this.u, obj2, mt5Var, (byte) 1);
            case 2:
                udj udjVar2 = new udj((byte) 2, mt5Var, obj2);
                udjVar2.u = obj;
                return udjVar2;
            case 3:
                return new udj(this.u, obj2, mt5Var, (byte) 3);
            case 4:
                return new udj(this.u, obj2, mt5Var, (byte) 4);
            case 5:
                return new udj(mt5Var, (Set) obj2, (hak) this.u);
            case 6:
                return new udj(mt5Var, this.u, obj2, (byte) 6);
            case 7:
                return new udj(this.u, obj2, mt5Var, (byte) 7);
            case 8:
                return new udj(this.u, obj2, mt5Var, (byte) 8);
            case 9:
                return new udj(this.u, obj2, mt5Var, (byte) 9);
            case 10:
                return new udj(this.u, obj2, mt5Var, (byte) 10);
            case 11:
                return new udj(this.u, obj2, mt5Var, (byte) 11);
            case 12:
                return new udj(this.u, obj2, mt5Var, (byte) 12);
            case 13:
                return new udj(this.u, obj2, mt5Var, (byte) 13);
            case 14:
                return new udj(this.u, obj2, mt5Var, (byte) 14);
            case 15:
                udj udjVar3 = new udj((byte) 15, mt5Var, obj2);
                udjVar3.u = obj;
                return udjVar3;
            case 16:
                return new udj(mt5Var, this.u, obj2, (byte) 16);
            case 17:
                udj udjVar4 = new udj((byte) 17, mt5Var, obj2);
                udjVar4.u = obj;
                return udjVar4;
            case 18:
                return new udj(this.u, obj2, mt5Var, (byte) 18);
            case 19:
                return new udj(this.u, obj2, mt5Var, (byte) 19);
            case 20:
                udj udjVar5 = new udj((byte) 20, mt5Var, obj2);
                udjVar5.u = obj;
                return udjVar5;
            case 21:
                return new udj(this.u, obj2, mt5Var, (byte) 21);
            case 22:
                udj udjVar6 = new udj((byte) 22, mt5Var, obj2);
                udjVar6.u = obj;
                return udjVar6;
            case 23:
                return new udj(mt5Var, this.u, obj2, (byte) 23);
            case 24:
                return new udj(this.u, obj2, mt5Var, (byte) 24);
            case 25:
                return new udj(this.u, obj2, mt5Var, (byte) 25);
            case 26:
                udj udjVar7 = new udj((byte) 26, mt5Var, obj2);
                udjVar7.u = obj;
                return udjVar7;
            case 27:
                return new udj(this.u, obj2, mt5Var, (byte) 27);
            case 28:
                udj udjVar8 = new udj((byte) 28, mt5Var, obj2);
                udjVar8.u = obj;
                return udjVar8;
            default:
                return new udj(mt5Var, this.u, obj2, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        Object obj3 = this.v;
        switch (b) {
            case 0:
                return create((lee) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((uij) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 3:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 4:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 5:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 6:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 7:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 8:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 9:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 10:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 11:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 12:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 13:
                return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 14:
                return new udj(this.u, obj3, (mt5) obj2, (byte) 14).invokeSuspend(Unit.a);
            case 15:
                udj udjVar = new udj((byte) 15, (mt5) obj2, obj3);
                udjVar.u = (cy0) obj;
                return udjVar.invokeSuspend(Unit.a);
            case 16:
                return new udj((mt5) obj2, this.u, obj3, (byte) 16).invokeSuspend(Unit.a);
            case 17:
                udj udjVar2 = new udj((byte) 17, (mt5) obj2, obj3);
                udjVar2.u = (cy0) obj;
                return udjVar2.invokeSuspend(Unit.a);
            case 18:
                return new udj(this.u, obj3, (mt5) obj2, (byte) 18).invokeSuspend(Unit.a);
            case 19:
                return new udj(this.u, obj3, (mt5) obj2, (byte) 19).invokeSuspend(Unit.a);
            case 20:
                udj udjVar3 = new udj((byte) 20, (mt5) obj2, obj3);
                udjVar3.u = (SQLiteDatabase) obj;
                return udjVar3.invokeSuspend(Unit.a);
            case 21:
                return new udj(this.u, obj3, (mt5) obj2, (byte) 21).invokeSuspend(Unit.a);
            case 22:
                udj udjVar4 = new udj((byte) 22, (mt5) obj2, obj3);
                udjVar4.u = (cy0) obj;
                return udjVar4.invokeSuspend(Unit.a);
            case 23:
                return new udj((mt5) obj2, this.u, obj3, (byte) 23).invokeSuspend(Unit.a);
            case 24:
                return new udj(this.u, obj3, (mt5) obj2, (byte) 24).invokeSuspend(Unit.a);
            case 25:
                return new udj(this.u, obj3, (mt5) obj2, (byte) 25).invokeSuspend(Unit.a);
            case 26:
                udj udjVar5 = new udj((byte) 26, (mt5) obj2, obj3);
                udjVar5.u = (cy0) obj;
                return udjVar5.invokeSuspend(Unit.a);
            case 27:
                return new udj(this.u, obj3, (mt5) obj2, (byte) 27).invokeSuspend(Unit.a);
            case 28:
                udj udjVar6 = new udj((byte) 28, (mt5) obj2, obj3);
                udjVar6.u = (td1) obj;
                return udjVar6.invokeSuspend(Unit.a);
            default:
                return new udj((mt5) obj2, this.u, obj3, (byte) 29).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[Catch: all -> 0x00ee, TryCatch #10 {all -> 0x00ee, blocks: (B:22:0x008f, B:24:0x0093, B:26:0x009f, B:37:0x00e0, B:39:0x00e4, B:27:0x00a9, B:29:0x00af, B:30:0x00b9, B:32:0x00bf, B:33:0x00c9, B:35:0x00cf, B:36:0x00d7), top: B:427:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0692  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.net.ProtocolException {
        /*
            Method dump skipped, instructions count: 2258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.udj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
