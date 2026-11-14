package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class uvc implements Function1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ uvc(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj) throws Exception {
        pga pgaVar;
        wsk wskVarH;
        switch (this.a) {
            case 0:
                k7 k7Var = (nh6) obj;
                f03.i(k7Var, '.');
                k7Var.d(new xa3(new ok9()));
                return Unit.a;
            case 1:
                kfg kfgVar = (kfg) obj;
                if (kfgVar.Z()) {
                    o1d o1dVar = kfgVar.b;
                    if (!o1dVar.o) {
                        Function1 function1E = kfgVar.a.e();
                        if (kfgVar.a.d() != null) {
                            o1dVar.N0();
                        } else if (function1E == null) {
                            o1dVar.h = null;
                            o1dVar.i = null;
                            o1dVar.g = null;
                            o1dVar.N0();
                        } else {
                            o1dVar.h = null;
                            o1dVar.i = null;
                            o1dVar.r0(kfgVar, 9223372034707292159L, 0L);
                            o1dVar.g = function1E;
                        }
                    }
                }
                return Unit.a;
            case 2:
                kfg kfgVar2 = (kfg) obj;
                if (kfgVar2.Z() && (pgaVar = kfgVar2.c) != null) {
                    o1d o1dVar2 = kfgVar2.b;
                    see seeVar = o1dVar2.r;
                    tee teeVar = seeVar != null ? (tee) seeVar.g(pgaVar) : null;
                    if (teeVar != null) {
                        pr prVar = o1dVar2.q;
                        if (prVar != null) {
                            prVar.z(pgaVar);
                        }
                        o1dVar2.L0(teeVar);
                        teeVar.b();
                    }
                }
                return Unit.a;
            case 3:
                ((Long) obj).getClass();
                return Unit.a;
            case 4:
                return Integer.valueOf(((l2g) obj).j);
            case 5:
                return Integer.valueOf(((l2g) obj).k);
            case 6:
                c3g c3gVar = (c3g) obj;
                if (c3gVar != null) {
                    return c3gVar.c;
                }
                return null;
            case 7:
                n6j n6jVar = (n6j) obj;
                n6j.c(n6jVar, 1, 2132021262, 1, 0, Collections.singletonList(2132021263), 24);
                n6j.c(n6jVar, 2, 2132020583, 2, 0, (List) null, 56);
                n6j.c(n6jVar, 3, 2132019072, 3, 0, (List) null, 56);
                return Unit.a;
            case 8:
                wskVarH = ((osk) obj).h("SELECT COUNT(id) FROM messages");
                try {
                    return Integer.valueOf(wskVarH.n() ? (int) wskVarH.getLong(0) : 0);
                } finally {
                }
            case 9:
                wskVarH = ((osk) obj).h("SELECT * FROM messages ORDER BY id ASC");
                try {
                    int iF = hyg.f(wskVarH, "id");
                    int iF2 = hyg.f(wskVarH, "received");
                    int iF3 = hyg.f(wskVarH, "created_by");
                    int iF4 = hyg.f(wskVarH, "encrypted_metadata");
                    int iF5 = hyg.f(wskVarH, "encrypted_content");
                    int iF6 = hyg.f(wskVarH, "content_url");
                    int iF7 = hyg.f(wskVarH, "iv_metadata");
                    int iF8 = hyg.f(wskVarH, "iv");
                    int iF9 = hyg.f(wskVarH, "local_content");
                    ArrayList arrayList = new ArrayList();
                    while (wskVarH.n()) {
                        arrayList.add(new fvd(wskVarH.getLong(iF), wskVarH.getLong(iF2), wskVarH.l(iF3), wskVarH.l(iF4), wskVarH.l(iF5), wskVarH.isNull(iF6) ? null : wskVarH.l(iF6), wskVarH.l(iF7), wskVarH.l(iF8), wskVarH.isNull(iF9) ? null : wskVarH.l(iF9)));
                    }
                    return arrayList;
                } finally {
                }
            case 10:
                try {
                    ((osk) obj).h("DELETE FROM messages").n();
                    return null;
                } finally {
                }
            case 11:
                wskVarH = ((osk) obj).h("SELECT MAX(id) FROM messages");
                try {
                    return (!wskVarH.n() || wskVarH.isNull(0)) ? null : Long.valueOf(wskVarH.getLong(0));
                } finally {
                }
            case 12:
                return Long.valueOf(((vzd) obj).getId());
            case 13:
                txj txjVar = ((eyj) obj).l;
                return txjVar != null ? txjVar.g : e0e.n;
            case 14:
                View view = (View) obj;
                if (view.isClickable()) {
                    return view;
                }
                return null;
            case 15:
                htm htmVar = (htm) obj;
                if (htmVar != null) {
                    return htmVar.b;
                }
                return null;
            case 16:
                d3e d3eVar = d3e.a;
                t41 t41Var = (t41) obj;
                Object[] objArr = {t41Var.b(0), t41Var.b(1), t41Var.b(2), t41Var.b(3), t41Var.b(4), t41Var.b(5), t41Var.b(6), t41Var.b(7), t41Var.b(8), t41Var.b(9), t41Var.a(10), t41Var.a(11), t41Var.a(12), t41Var.a(13), t41Var.a(14), t41Var.a(15), t41Var.a(16), t41Var.b(17), t41Var.b(18), t41Var.b(19), t41Var.a(20), t41Var.a(21), t41Var.a(22), t41Var.b(23), t41Var.b(24), t41Var.b(25)};
                if (objArr.length == 26) {
                    return new h2e((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4], (String) objArr[5], (String) objArr[6], (String) objArr[7], (String) objArr[8], (String) objArr[9], ((Number) objArr[10]).longValue(), (Long) objArr[11], ((Number) objArr[12]).longValue(), (Long) objArr[13], (Long) objArr[14], (Long) objArr[15], ((Number) objArr[16]).longValue(), (String) objArr[17], (String) objArr[18], (String) objArr[19], (Long) objArr[20], (Long) objArr[21], (Long) objArr[22], (String) objArr[23], (String) objArr[24], (String) objArr[25]);
                }
                qp2.o("Expected 26 arguments");
                return null;
            case 17:
                ((Function1) obj).invoke("missions");
                return Unit.a;
            case 18:
                ((Function1) obj).invoke("missions");
                return Unit.a;
            case 19:
                e3e e3eVar = e3e.a;
                t41 t41Var2 = (t41) obj;
                Object[] objArr2 = {t41Var2.b(0), t41Var2.b(1), t41Var2.b(2), t41Var2.b(3), t41Var2.b(4), t41Var2.b(5), t41Var2.b(6), t41Var2.b(7), t41Var2.b(8), t41Var2.b(9), t41Var2.a(10), t41Var2.a(11), t41Var2.a(12), t41Var2.a(13), t41Var2.a(14), t41Var2.a(15), t41Var2.a(16), t41Var2.b(17), t41Var2.b(18), t41Var2.b(19), t41Var2.a(20), t41Var2.a(21), t41Var2.a(22), t41Var2.b(23), t41Var2.b(24), t41Var2.b(25)};
                if (objArr2.length == 26) {
                    return new h2e((String) objArr2[0], (String) objArr2[1], (String) objArr2[2], (String) objArr2[3], (String) objArr2[4], (String) objArr2[5], (String) objArr2[6], (String) objArr2[7], (String) objArr2[8], (String) objArr2[9], ((Number) objArr2[10]).longValue(), (Long) objArr2[11], ((Number) objArr2[12]).longValue(), (Long) objArr2[13], (Long) objArr2[14], (Long) objArr2[15], ((Number) objArr2[16]).longValue(), (String) objArr2[17], (String) objArr2[18], (String) objArr2[19], (Long) objArr2[20], (Long) objArr2[21], (Long) objArr2[22], (String) objArr2[23], (String) objArr2[24], (String) objArr2[25]);
                }
                qp2.o("Expected 26 arguments");
                return null;
            case 20:
                ((Function1) obj).invoke("missions");
                return Unit.a;
            case 21:
                c3e c3eVar = c3e.a;
                t41 t41Var3 = (t41) obj;
                Object[] objArr3 = {t41Var3.b(0), t41Var3.b(1), t41Var3.b(2), t41Var3.b(3), t41Var3.b(4), t41Var3.b(5), t41Var3.b(6), t41Var3.b(7), t41Var3.b(8), t41Var3.b(9), t41Var3.a(10), t41Var3.a(11), t41Var3.a(12), t41Var3.a(13), t41Var3.a(14), t41Var3.a(15), t41Var3.a(16), t41Var3.b(17), t41Var3.b(18), t41Var3.b(19), t41Var3.a(20), t41Var3.a(21), t41Var3.a(22), t41Var3.b(23), t41Var3.b(24), t41Var3.b(25)};
                if (objArr3.length == 26) {
                    return new h2e((String) objArr3[0], (String) objArr3[1], (String) objArr3[2], (String) objArr3[3], (String) objArr3[4], (String) objArr3[5], (String) objArr3[6], (String) objArr3[7], (String) objArr3[8], (String) objArr3[9], ((Number) objArr3[10]).longValue(), (Long) objArr3[11], ((Number) objArr3[12]).longValue(), (Long) objArr3[13], (Long) objArr3[14], (Long) objArr3[15], ((Number) objArr3[16]).longValue(), (String) objArr3[17], (String) objArr3[18], (String) objArr3[19], (Long) objArr3[20], (Long) objArr3[21], (Long) objArr3[22], (String) objArr3[23], (String) objArr3[24], (String) objArr3[25]);
                }
                qp2.o("Expected 26 arguments");
                return null;
            case 22:
                Long lA = ((t41) obj).a(0);
                lA.longValue();
                return lA;
            case 23:
                ((Function1) obj).invoke("missions");
                return Unit.a;
            case 24:
                ((Function1) obj).invoke("missions");
                return Unit.a;
            case 25:
                htm htmVar2 = (htm) obj;
                v28 v28Var = htmVar2.j;
                return new Pair(v28Var != null ? v28Var.a : null, htmVar2.m);
            case 26:
                htm htmVar3 = (htm) obj;
                return new Pair(htmVar3.j, Boolean.valueOf(htmVar3.i));
            case 27:
                return Boolean.TRUE;
            case 28:
                o0j.k((q0j) obj);
                return Unit.a;
            default:
                xtb[] xtbVarArr = o0j.a;
                p0j p0jVar = n0j.y;
                Unit unit = Unit.a;
                ((q0j) obj).b(p0jVar, unit);
                return unit;
        }
    }
}
