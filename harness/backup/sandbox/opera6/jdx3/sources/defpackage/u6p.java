package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u6p extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ o7p j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6p(o7p o7pVar, byte b) {
        super(1);
        this.i = b;
        this.j = o7pVar;
    }

    public final Object invoke(Object obj) {
        kko kkoVar;
        switch (this.i) {
            case 0:
                o7p o7pVar = this.j;
                ny3 ny3Var = o7pVar.o;
                if (ny3Var != null && !ny3Var.a) {
                    ny3Var.b();
                    lzo lzoVar = (lzo) ny3Var.h;
                    if (lzoVar != null) {
                        lzoVar.a();
                    }
                    ny3Var.h = null;
                    ne5 ne5Var = (ne5) ny3Var.i;
                    if (ne5Var != null) {
                        ne5Var.o();
                    }
                    ny3Var.i = null;
                    ny3Var.g = null;
                    ny3Var.a = true;
                }
                o7pVar.o = null;
                super/*pxo*/.a();
                return null;
            case 1:
                this.j.h("media", (String) obj);
                return Unit.a;
            case 2:
                int i = ((Throwable) obj) != null ? 1001 : 0;
                p7p p7pVar = this.j.i;
                if (p7pVar != null) {
                    p7pVar.a(i);
                }
                return Unit.a;
            default:
                o7p o7pVar2 = this.j;
                ne5 ne5Var2 = o7pVar2.n;
                if (ne5Var2 != null) {
                    ne5Var2.o();
                }
                o7pVar2.n = null;
                sxo sxoVar = o7pVar2.g;
                if (sxoVar != null) {
                    uio uioVar = sxoVar.a;
                    if (uioVar != null) {
                        uioVar.c();
                    }
                    sxoVar.a = null;
                    sxoVar.b = null;
                    sxoVar.c = null;
                }
                o7pVar2.g = null;
                y2p y2pVar = (y2p) o7pVar2.d;
                if (y2pVar != null) {
                    sro sroVar = (sro) y2pVar.D.getValue();
                    if (sroVar != null) {
                        sroVar.d();
                    }
                    sro sroVar2 = (sro) y2pVar.E.getValue();
                    if (sroVar2 != null) {
                        sroVar2.d();
                    }
                }
                ny3 ny3Var2 = o7pVar2.o;
                if (ny3Var2 != null) {
                    ny3Var2.b();
                }
                igi igiVar = o7pVar2.m;
                if (igiVar != null) {
                    for (View view : igiVar.a()) {
                        view.setOnClickListener(null);
                        view.setOnTouchListener(null);
                    }
                }
                o7pVar2.m = null;
                List listSingletonList = Collections.singletonList(o7pVar2.l);
                ArrayList arrayList = new ArrayList();
                CollectionsKt.I(listSingletonList, arrayList);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    View view2 = (View) obj2;
                    view2.setOnClickListener(null);
                    view2.setOnTouchListener(null);
                    xgh.g(view2);
                }
                o7pVar2.l = null;
                iko ikoVar = o7pVar2.k;
                if (ikoVar != null && (kkoVar = (kko) ikoVar.a.findViewById(iko.b)) != null) {
                    xgh.g(kkoVar);
                }
                o7pVar2.k = null;
                ViewGroup viewGroup = o7pVar2.f;
                if (viewGroup != null) {
                    viewGroup.setOnClickListener(null);
                    viewGroup.setOnTouchListener(null);
                }
                o7pVar2.f = null;
                o7pVar2.p = null;
                ne5 ne5Var3 = o7pVar2.h;
                if (ne5Var3 != null) {
                    ((WeakHashMap) ne5Var3.b).clear();
                    ((WeakHashMap) ne5Var3.c).clear();
                    ((WeakHashMap) ne5Var3.d).clear();
                    tuj tujVar = (tuj) ne5Var3.a;
                    ((WeakHashMap) tujVar.g).clear();
                    ((Handler) tujVar.k).removeMessages(0);
                    tujVar.c = false;
                    ((Handler) ne5Var3.e).removeMessages(0);
                }
                return null;
        }
    }
}
