package defpackage;

import com.leanplum.utils.SizeUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes.dex */
public final /* synthetic */ class nf8 implements Function2 {
    public final /* synthetic */ byte a;

    public /* synthetic */ nf8(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = 0;
        switch (this.a) {
            case 0:
                return CollectionsKt.V((List) obj2, (List) obj);
            case 1:
                int[] iArr = (int[]) obj2;
                ((g8j) ((d8j) obj)).e(Arrays.copyOf(iArr, iArr.length));
                return Unit.a;
            case 2:
                throw ((IOException) obj2);
            case 3:
                throw ((IOException) obj2);
            case 4:
                return Boolean.valueOf(Intrinsics.a(obj, obj2));
            case 5:
                int[] iArr2 = (int[]) obj2;
                int[] iArrCopyOf = Arrays.copyOf(iArr2, iArr2.length);
                g8j g8jVar = (g8j) ((d8j) obj);
                g8jVar.getClass();
                g8jVar.b.e(new dw9(new oba(2, 0, iArrCopyOf)), false);
                return Unit.a;
            case 6:
                int[] iArr3 = (int[]) obj2;
                int[] iArrCopyOf2 = Arrays.copyOf(iArr3, iArr3.length);
                g8j g8jVar2 = (g8j) ((d8j) obj);
                g8jVar2.getClass();
                g8jVar2.b.e(new baa(new oba(2, 0, iArrCopyOf2)), false);
                return Unit.a;
            case 7:
                dg5 dg5Var = (dg5) ((hba) obj2).a.getValue();
                if (dg5Var != null) {
                    return new Pair(Integer.valueOf(dg5Var.a), dg5Var.b.name());
                }
                return null;
            case 8:
                ((Integer) obj2).getClass();
                y9m.k((ih5) obj, aoh.m(1));
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                long jMin = Math.min((long) (Math.pow(2.0d, ((Integer) obj2).intValue() - 1) * 1000.0d), 60000L);
                uih.a.getClass();
                return Long.valueOf(uih.b.n(1000L) + jMin);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return Unit.a;
            case 11:
                g0c g0cVar = (g0c) obj;
                zhj.a(new p3m((v3m) g0cVar.b.b.get()), 4099).c(g0cVar.a);
                return Unit.a;
            case 12:
                u6c u6cVar = (u6c) obj2;
                return Arrays.asList(Integer.valueOf(u6cVar.h()), Integer.valueOf(u6cVar.i()));
            case 13:
                Map mapD = ((z6c) obj2).d();
                if (mapD.isEmpty()) {
                    return null;
                }
                return mapD;
            case 14:
                int[] iArr4 = (int[]) obj2;
                int[] iArrCopyOf3 = Arrays.copyOf(iArr4, iArr4.length);
                g8j g8jVar3 = (g8j) ((d8j) obj);
                g8jVar3.getClass();
                g8jVar3.b.e(new brd(new oba(2, 0, iArrCopyOf3)), false);
                return Unit.a;
            case 15:
                return new xzd((u3l) obj, (Set) obj2);
            case 16:
                ((Integer) obj).getClass();
                return ((g2e) obj2).a().a;
            case 17:
                ((Integer) obj).getClass();
                return ((g2e) obj2).a().a;
            case SizeUtil.textSize0_1 /* 18 */:
                u9f u9fVar = (u9f) ((ini) obj).a(uqh.a(u9f.class), (rhk) null, (Function0) null);
                File externalFilesDir = u9fVar.a.getExternalFilesDir("http_cache");
                if (externalFilesDir == null) {
                    externalFilesDir = new File(u9fVar.a.getFilesDir(), "http_cache");
                }
                s9f s9fVar = new s9f();
                s9fVar.l = new a74(externalFilesDir, 50000000L);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                s9fVar.a(30L, timeUnit);
                s9fVar.b(30L, timeUnit);
                s9fVar.A = _UtilJvmKt.checkDuration("timeout", 30L, timeUnit);
                ArrayList arrayList = u9fVar.c;
                int size = arrayList.size();
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    s9fVar.c.add((eeb) obj3);
                }
                u9fVar.b.getClass();
                return new t9f(s9fVar);
            case 19:
                int[] iArr5 = (int[]) obj2;
                ((wre) obj).a(Arrays.copyOf(iArr5, iArr5.length));
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                int[] iArr6 = (int[]) obj2;
                ((zwe) obj).a(Arrays.copyOf(iArr6, iArr6.length));
                return Unit.a;
            case 21:
                ini iniVar = (ini) obj;
                return new ece(z4c.a(f7c.a, new cw5(iniVar, (byte) 1)), (nx5) iniVar.a(uqh.a(nx5.class), (rhk) null, (Function0) null), (cb7) iniVar.a(uqh.a(cb7.class), (rhk) null, (Function0) null), (yin) iniVar.a(uqh.a(yin.class), (rhk) null, (Function0) null));
            case SizeUtil.textSize1 /* 22 */:
                int[] iArr7 = (int[]) obj2;
                int[] iArrCopyOf4 = Arrays.copyOf(iArr7, iArr7.length);
                g8j g8jVar4 = (g8j) ((d8j) obj);
                g8jVar4.getClass();
                g8jVar4.b.e(new x2f(new oba(2, 0, iArrCopyOf4)), false);
                return Unit.a;
            case 23:
                s16.o(((w6g) obj).a.w(), true).a.w();
                return new ylj();
            case SizeUtil.textSize2 /* 24 */:
                return Integer.valueOf(((pfd) obj).z(((Integer) obj2).intValue()));
            case 25:
                return Integer.valueOf(((pfd) obj).J(((Integer) obj2).intValue()));
            case 26:
                return Integer.valueOf(((pfd) obj).c(((Integer) obj2).intValue()));
            case 27:
                return Integer.valueOf(((pfd) obj).E(((Integer) obj2).intValue()));
            case 28:
                ((ot2) ((jt2) obj)).d();
                return Unit.a;
            default:
                int[] iArr8 = (int[]) obj2;
                ((ot2) ((jt2) obj)).e(Arrays.copyOf(iArr8, iArr8.length));
                return Unit.a;
        }
    }
}
