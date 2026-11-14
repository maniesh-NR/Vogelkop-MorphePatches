package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class brk implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mrk b;

    public /* synthetic */ brk(mrk mrkVar, byte b) {
        this.a = b;
        this.b = mrkVar;
    }

    public final Object invoke() {
        Uri uri;
        byte b = this.a;
        mrk mrkVar = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(mrkVar.h.b());
            case 1:
                return Boolean.valueOf(mrkVar.I.a);
            case 2:
                hqk hqkVar = mrkVar.C;
                hqkVar.getClass();
                ArrayList arrayList = new ArrayList();
                for (gqk gqkVar : hqkVar.y) {
                    if (gqkVar instanceof fqk) {
                        arrayList.add(((fqk) gqkVar).c);
                    }
                }
                if (hqkVar.j) {
                    Collections.reverse(arrayList);
                }
                return arrayList;
            case 3:
                b2l b2lVar = mrkVar.i.o;
                return Boolean.valueOf(b2lVar != null ? ((d7l) b2lVar).j.m() : false);
            case 4:
                Iterable<jx1> iterable = (Iterable) mrkVar.G.v.g();
                ArrayList arrayList2 = new ArrayList(k95.o(iterable, 10));
                for (jx1 jx1Var : iterable) {
                    if (jx1Var != null) {
                        boolean z = jx1Var instanceof vx1;
                        xx0 vx0Var = wx0.a;
                        if (z) {
                            wxe wxeVar = ((vx1) jx1Var).b;
                            if (wxeVar != null) {
                                if (wxeVar instanceof qx1) {
                                    vx0Var = new ux0(((qx1) wxeVar).o);
                                } else if (!(wxeVar instanceof tx1)) {
                                }
                            }
                            h9o.p();
                            return null;
                        }
                        if (jx1Var instanceof fz1) {
                            fz1 fz1Var = (fz1) jx1Var;
                            if (fz1Var.c == null) {
                                vx0Var = new vx0(fz1Var.b.length());
                            }
                        }
                        arrayList2.add(vx0Var);
                    }
                    h9o.p();
                    return null;
                    break;
                }
                return arrayList2;
            case 5:
                Iterable<jx1> iterable2 = (Iterable) mrkVar.G.v.g();
                ArrayList arrayList3 = new ArrayList();
                for (jx1 jx1Var2 : iterable2) {
                    if (jx1Var2 != null) {
                        if (jx1Var2 instanceof vx1) {
                            wxe wxeVar2 = ((vx1) jx1Var2).b;
                            if (wxeVar2 != null) {
                                if (wxeVar2 instanceof qx1) {
                                    uri = null;
                                } else if (wxeVar2 instanceof tx1) {
                                    uri = ((tx1) wxeVar2).m;
                                }
                            }
                            h9o.p();
                            return null;
                        }
                        if (jx1Var2 instanceof fz1) {
                            uri = ((fz1) jx1Var2).c;
                        }
                        if (uri != null) {
                            arrayList3.add(uri);
                        }
                    }
                    h9o.p();
                    return null;
                    break;
                }
                return arrayList3;
            default:
                xf8.F0(mrkVar.x, mrkVar.e());
                return Unit.a;
        }
    }
}
