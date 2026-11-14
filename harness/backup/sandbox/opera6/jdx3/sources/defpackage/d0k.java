package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.i;
import com.opera.android.favorites.SuggestionFavoriteLayoutManager;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d0k extends pa3 implements f7f {
    public final ipk b;
    public final x5f c;
    public final ikc d;
    public final xok e;
    public final h42 f;
    public final w6j g;
    public final RecyclerView h;
    public final izj i;
    public final hok j;
    public final SuggestionFavoriteLayoutManager k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;

    public d0k(fe5 fe5Var, ipk ipkVar, View view, x5f x5fVar, SettingsManager settingsManager, x5f x5fVar2, osf osfVar, cbf cbfVar, qr8 qr8Var, nv2 nv2Var, ikc ikcVar, p6l p6lVar) {
        int iC;
        super(view);
        this.b = ipkVar;
        this.c = x5fVar;
        this.d = ikcVar;
        xok xokVar = new xok();
        this.e = xokVar;
        yc3 yc3Var = new yc3(this, (byte) 6);
        this.f = (h42) ipkVar.a.d;
        w6j w6jVar = new w6j(new txi(this, (byte) 13), x5fVar, osfVar);
        this.g = w6jVar;
        RecyclerView recyclerViewRequireViewById = ((i) this).itemView.requireViewById(2131363055);
        this.h = recyclerViewRequireViewById;
        izj izjVar = new izj(recyclerViewRequireViewById.getContext(), fe5Var, new ikc(Boolean.FALSE), fsp.m(((i) this).itemView));
        this.i = izjVar;
        pde pdeVar = izjVar.d;
        hok hokVar = new hok(xokVar, settingsManager, (tta) pdeVar.g(), w6jVar, cbfVar, x5fVar2, qr8Var, nv2Var, p6lVar);
        this.j = hokVar;
        tta ttaVar = (tta) pdeVar.g();
        Context context = recyclerViewRequireViewById.getContext();
        tta ttaVar2 = (tta) pdeVar.g();
        int iIntValue = ((Number) ikcVar.g()).intValue();
        int iWidth = r9n.i(context).width();
        sta staVar = ttaVar2.h;
        int i = staVar.a;
        int i2 = iWidth - (iIntValue << 1);
        int i3 = ttaVar2.c;
        int i4 = i3;
        int i5 = 1;
        while (i5 < 16 && i4 + i + i3 <= i2) {
            i4 = i + i3 + i4;
            i5++;
        }
        if (i5 > 1) {
            iC = djh.c((i2 - (i3 * i5)) / (i5 - 1), i, staVar.b);
        } else {
            iC = 0;
        }
        SuggestionFavoriteLayoutManager suggestionFavoriteLayoutManager = new SuggestionFavoriteLayoutManager(recyclerViewRequireViewById, ttaVar, new gr8(i5, i3, iC, ttaVar2.a), hokVar, new zzh(this, (byte) 8));
        this.k = suggestionFavoriteLayoutManager;
        recyclerViewRequireViewById.B0((e) null);
        recyclerViewRequireViewById.y0(hokVar);
        recyclerViewRequireViewById.C0(suggestionFavoriteLayoutManager);
        recyclerViewRequireViewById.o(yc3Var);
        final byte b = 0;
        ikcVar.j(fe5Var, new t7d(new Function1(this) { // from class: c0k
            public final /* synthetic */ d0k b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                d0k d0kVar = this.b;
                switch (b2) {
                    case 0:
                        d0kVar.Z();
                        break;
                    default:
                        d0kVar.Z();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 14));
        final byte b2 = 1;
        pdeVar.j(fe5Var, new t7d(new Function1(this) { // from class: c0k
            public final /* synthetic */ d0k b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b2;
                d0k d0kVar = this.b;
                switch (b22) {
                    case 0:
                        d0kVar.Z();
                        break;
                    default:
                        d0kVar.Z();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 14));
    }

    @Override // defpackage.pa3
    public final void U(gqk gqkVar, String str) {
        if (this.p) {
            return;
        }
        this.p = true;
        ((HashSet) this.j.C).clear();
        h42 h42Var = this.f;
        h42Var.k(this);
        this.o = true;
        d0((lpk) h42Var.g());
        w6j w6jVar = this.g;
        ((SparseArray) w6jVar.c).clear();
        ((SparseArray) w6jVar.d).clear();
        this.n = true;
    }

    @Override // defpackage.pa3
    public final void Y() {
        this.l = false;
        if (this.n) {
            this.g.n(-1, xk0.b);
            this.n = false;
        }
        this.f.p(this);
        this.o = false;
        this.p = false;
    }

    public final void Z() {
        izj izjVar = this.i;
        tta ttaVar = (tta) izjVar.d.g();
        SuggestionFavoriteLayoutManager suggestionFavoriteLayoutManager = this.k;
        suggestionFavoriteLayoutManager.getClass();
        suggestionFavoriteLayoutManager.b = ttaVar.c;
        suggestionFavoriteLayoutManager.c = ttaVar.a;
        Context context = this.h.getContext();
        pde pdeVar = izjVar.d;
        tta ttaVar2 = (tta) pdeVar.g();
        int iIntValue = ((Number) this.d.g()).intValue();
        int iWidth = r9n.i(context).width();
        sta staVar = ttaVar2.h;
        int i = staVar.a;
        int i2 = iWidth - (iIntValue << 1);
        int i3 = ttaVar2.c;
        int i4 = i3;
        int i5 = 1;
        while (i5 < 16 && i4 + i + i3 <= i2) {
            i4 += i + i3;
            i5++;
        }
        if (i5 > 1) {
            djh.c((i2 - (i3 * i5)) / (i5 - 1), i, staVar.b);
        }
        suggestionFavoriteLayoutManager.a = i5;
        this.j.V((tta) pdeVar.g());
    }

    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final void d0(lpk lpkVar) {
        List arrayList;
        int i;
        if (this.o) {
            if (lpkVar == null || (i = this.m) == 0) {
                arrayList = new ArrayList();
            } else {
                this.o = false;
                arrayList = i == 0 ? Collections.EMPTY_LIST : lpkVar.c;
            }
            this.e.D(arrayList);
        }
    }
}
