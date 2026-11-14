package defpackage;

import J.N;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.opera.android.OperaApplication;
import com.opera.android.favorites.FavoritesBridge;
import com.opera.android.favorites.e;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class ns8 extends d implements gq8, sq8, sj7 {
    public boolean A;
    public boolean a;
    public final qr8 b;
    public final s9i c;
    public final boolean d;
    public RecyclerView e;
    public r9i f;
    public tta g;
    public final vi7 i;
    public final flb j;
    public final skm l;
    public final SettingsManager m;
    public final boolean n;
    public final boolean o;
    public bn7 r;
    public qlk s;
    public boolean t;
    public final nv2 u;
    public final zr8 v;
    public final zr8 w;
    public final tlg x;
    public final zzj y;
    public final p6l z;
    public vr8 h = vr8.l;
    public final h7f k = new h7f();
    public final gs8 p = new gs8();
    public final HashMap q = new HashMap();

    /* JADX WARN: Type inference failed for: r2v1, types: [zr8] */
    /* JADX WARN: Type inference failed for: r2v2, types: [zr8] */
    public ns8(tq8 tq8Var, SettingsManager settingsManager, boolean z, o28 o28Var, tta ttaVar, boolean z2, boolean z3, skm skmVar, qr8 qr8Var, nv2 nv2Var, tlg tlgVar, zzj zzjVar, p6l p6lVar) {
        this.x = tlgVar;
        final byte b = 1;
        setHasStableIds(true);
        this.c = new s9i(this, tq8Var);
        final byte b2 = 0;
        this.v = new f7f(this) { // from class: zr8
            public final /* synthetic */ ns8 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b2;
                ns8 ns8Var = this.b;
                switch (b3) {
                    case 0:
                        ns8Var.A = ((Boolean) obj).booleanValue();
                        tlg tlgVar2 = ns8Var.x;
                        Objects.requireNonNull(tlgVar2);
                        ns8Var.Z((pzj) tlgVar2.i.g(), ns8Var.A);
                        break;
                    default:
                        ns8Var.Z((pzj) obj, ns8Var.A);
                        break;
                }
            }
        };
        this.w = new f7f(this) { // from class: zr8
            public final /* synthetic */ ns8 b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b3 = b;
                ns8 ns8Var = this.b;
                switch (b3) {
                    case 0:
                        ns8Var.A = ((Boolean) obj).booleanValue();
                        tlg tlgVar2 = ns8Var.x;
                        Objects.requireNonNull(tlgVar2);
                        ns8Var.Z((pzj) tlgVar2.i.g(), ns8Var.A);
                        break;
                    default:
                        ns8Var.Z((pzj) obj, ns8Var.A);
                        break;
                }
            }
        };
        this.d = z;
        this.g = ttaVar;
        vi7 vi7VarG = G(ttaVar.a, o28Var);
        this.i = vi7VarG;
        this.j = vi7VarG != null ? vi7VarG.g : null;
        this.n = z2;
        this.o = z3;
        this.l = skmVar;
        this.m = settingsManager;
        this.b = qr8Var;
        this.u = nv2Var;
        this.y = zzjVar;
        this.z = p6lVar;
    }

    @Override // defpackage.sq8
    public final void B(int i, hq8 hq8Var) {
        notifyItemRemoved(i);
    }

    public vi7 G(int i, o28 o28Var) {
        if (!this.d) {
            return null;
        }
        vi7 vi7Var = new vi7(vml.d, i, ((tq8) this.c.b).y(), 500, this, true);
        vi7Var.t = false;
        vi7Var.n = o28Var;
        return vi7Var;
    }

    public List H(final Context context, final hq8 hq8Var) {
        ArrayList arrayList = new ArrayList();
        String strI = hq8Var.i(this.z);
        hk6.e.getClass();
        boolean zP = a36.p(strI);
        final byte b = 1;
        final byte b2 = 0;
        if (this.d) {
            if (!zP) {
                arrayList.add(new gtd(new rxh(2132020200), new lxh(2131231967), new View.OnClickListener(this) { // from class: as8
                    public final /* synthetic */ ns8 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        hq8 hq8Var2 = hq8Var;
                        ns8 ns8Var = this.b;
                        switch (b3) {
                            case 0:
                                ns8Var.P(hq8Var2, lqm.f);
                                break;
                            default:
                                ns8Var.P(hq8Var2, lqm.h);
                                break;
                        }
                    }
                }));
            }
            arrayList.add(new gtd(new rxh(2132018740), new lxh(2131231742), new View.OnClickListener(this) { // from class: bs8
                public final /* synthetic */ ns8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b2;
                    hq8 hq8Var2 = hq8Var;
                    Context context2 = context;
                    ns8 ns8Var = this.b;
                    switch (b3) {
                        case 0:
                            byte b4 = 1;
                            if (!hq8Var2.j()) {
                                z77 z77VarU = sfe.U(context2);
                                mv mvVar = new mv(hq8Var2, b4);
                                z77VarU.getClass();
                                z77VarU.b(mvVar, ijm.b);
                                break;
                            } else {
                                ns8Var.Y((tq8) hq8Var2, true);
                                break;
                            }
                        default:
                            ns8Var.I(context2, hq8Var2);
                            break;
                    }
                }
            }));
            arrayList.add(new gtd(new rxh(2132018535), new lxh(2131232064), new View.OnClickListener(this) { // from class: bs8
                public final /* synthetic */ ns8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b;
                    hq8 hq8Var2 = hq8Var;
                    Context context2 = context;
                    ns8 ns8Var = this.b;
                    switch (b3) {
                        case 0:
                            byte b4 = 1;
                            if (!hq8Var2.j()) {
                                z77 z77VarU = sfe.U(context2);
                                mv mvVar = new mv(hq8Var2, b4);
                                z77VarU.getClass();
                                z77VarU.b(mvVar, ijm.b);
                                break;
                            } else {
                                ns8Var.Y((tq8) hq8Var2, true);
                                break;
                            }
                        default:
                            ns8Var.I(context2, hq8Var2);
                            break;
                    }
                }
            }));
            return arrayList;
        }
        if (!zP) {
            arrayList.add(new gtd(new rxh(2132020200), new lxh(2131231967), new View.OnClickListener(this) { // from class: as8
                public final /* synthetic */ ns8 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b;
                    hq8 hq8Var2 = hq8Var;
                    ns8 ns8Var = this.b;
                    switch (b3) {
                        case 0:
                            ns8Var.P(hq8Var2, lqm.f);
                            break;
                        default:
                            ns8Var.P(hq8Var2, lqm.h);
                            break;
                    }
                }
            }));
        }
        arrayList.add(new gtd(new rxh(2132019754), new lxh(2131232250), new View.OnClickListener(this) { // from class: cs8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                hq8 hq8Var2 = hq8Var;
                Context context2 = context;
                switch (b3) {
                    case 0:
                        String[] strArr = OperaApplication.K;
                        nr8 nr8VarO = ((OperaApplication) context2.getApplicationContext()).o();
                        if (!hq8Var2.j()) {
                            ((OperaApplication) context2.getApplicationContext()).o().b(hq8Var2.h(), hq8Var2.i(p6l.a));
                            break;
                        } else {
                            ((e) nr8VarO).j((tq8) hq8Var2, new rqd((byte) 6));
                            break;
                        }
                    default:
                        p6l p6lVar = p6l.a;
                        ClipData clipDataNewPlainText = ClipData.newPlainText(hq8Var2.i(p6lVar), hq8Var2.i(p6lVar));
                        ClipboardManager clipboardManager = (ClipboardManager) context2.getSystemService("clipboard");
                        if (clipboardManager != null) {
                            clipboardManager.setPrimaryClip(clipDataNewPlainText);
                            if (Build.VERSION.SDK_INT < 33) {
                                Toast.makeText(context2, context2.getString(2132018397), 0).show();
                                break;
                            }
                        }
                        break;
                }
            }
        }));
        if (!hq8Var.j()) {
            arrayList.add(new gtd(new rxh(2132018420), new lxh(2131232051), new View.OnClickListener(this) { // from class: cs8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b;
                    hq8 hq8Var2 = hq8Var;
                    Context context2 = context;
                    switch (b3) {
                        case 0:
                            String[] strArr = OperaApplication.K;
                            nr8 nr8VarO = ((OperaApplication) context2.getApplicationContext()).o();
                            if (!hq8Var2.j()) {
                                ((OperaApplication) context2.getApplicationContext()).o().b(hq8Var2.h(), hq8Var2.i(p6l.a));
                                break;
                            } else {
                                ((e) nr8VarO).j((tq8) hq8Var2, new rqd((byte) 6));
                                break;
                            }
                        default:
                            p6l p6lVar = p6l.a;
                            ClipData clipDataNewPlainText = ClipData.newPlainText(hq8Var2.i(p6lVar), hq8Var2.i(p6lVar));
                            ClipboardManager clipboardManager = (ClipboardManager) context2.getSystemService("clipboard");
                            if (clipboardManager != null) {
                                clipboardManager.setPrimaryClip(clipDataNewPlainText);
                                if (Build.VERSION.SDK_INT < 33) {
                                    Toast.makeText(context2, context2.getString(2132018397), 0).show();
                                    break;
                                }
                            }
                            break;
                    }
                }
            }));
        }
        return arrayList;
    }

    public void I(Context context, hq8 hq8Var) {
        String[] strArr = OperaApplication.K;
        ((e) ((OperaApplication) context.getApplicationContext()).o()).getClass();
        long jE = hq8Var.e();
        i7f i7fVar = FavoritesBridge.a;
        N.Mw8yLl_M(jE);
    }

    public final void J(vx3 vx3Var, boolean z) {
        boolean z2 = this.m.C() == q7j.BACKGROUND;
        vx3Var.c(true);
        vx3Var.k = wx3.Go;
        vx3Var.c = 1;
        vx3Var.a(!z2);
        vx3Var.d(z2 || !z);
        vx3Var.f = z;
        am2.v(vx3Var);
    }

    public final int K(hq8 hq8Var) {
        tq8 tq8Var = (tq8) this.c.b;
        tq8Var.getClass();
        if (hq8Var.b != tq8Var) {
            return -1;
        }
        return hq8Var.c;
    }

    public final boolean L(fs8 fs8Var, hq8 hq8Var) {
        if (((i) fs8Var).itemView.getParent() == null) {
            return false;
        }
        flb flbVar = this.j;
        if (flbVar != null && flbVar.p != -1) {
            flbVar.s(fs8Var);
        }
        RecyclerView parent = ((i) fs8Var).itemView.getParent();
        List listH = H(((i) fs8Var).itemView.getContext(), hq8Var);
        if (listH == null || listH.isEmpty()) {
            return false;
        }
        exd exdVar = new exd((ViewGroup) this.b.i.get(), (hxj) new i3j(parent, this, hq8Var), this.o ? ftd.HIGH : ftd.NORMAL, listH);
        gs8 gs8Var = this.p;
        exdVar.a(gs8Var);
        if (flbVar == null || !this.a) {
            ((i) fs8Var).itemView.getParent().requestDisallowInterceptTouchEvent(true);
        }
        Context context = parent.getContext();
        gs8Var.getClass();
        gs8Var.b = z7h.h(context, 16.0f);
        exdVar.f();
        return true;
    }

    public void M(e eVar, hq8 hq8Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zM = hq8Var.m();
        x5f x5fVar = (x5f) this.l;
        x5fVar.getClass();
        x5fVar.T0(new c5f(jCurrentTimeMillis, zM, this.n));
        eVar.k(hq8Var);
    }

    public final void P(hq8 hq8Var, lqm lqmVar) {
        RecyclerView recyclerView = this.e;
        if (recyclerView != null) {
            recyclerView.getContext();
            boolean zJ = hq8Var.j();
            lqm lqmVar2 = lqm.h;
            p6l p6lVar = this.z;
            if (!zJ) {
                J(ay3.a(hq8Var.i(p6lVar), lqmVar, false), lqmVar != lqmVar2);
                return;
            }
            tq8 tq8Var = (tq8) hq8Var;
            ArrayList arrayList = tq8Var.e;
            int size = arrayList.size();
            vx3 vx3VarA = null;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                hq8 hq8Var2 = (hq8) obj;
                if (!hq8Var2.j()) {
                    if (vx3VarA == null) {
                        vx3VarA = ay3.a(hq8Var2.i(p6lVar), lqmVar, false);
                    } else {
                        vx3VarA.b(hq8Var2.i(p6lVar), false);
                    }
                }
            }
            if (vx3VarA == null) {
                return;
            }
            vx3VarA.i = new v4l(tq8Var.h(), false, false);
            J(vx3VarA, lqmVar != lqmVar2);
        }
    }

    @Override // defpackage.gq8
    public final void Q(hq8 hq8Var) {
    }

    public void T() {
        tlg tlgVar = this.x;
        if (tlgVar == null || !this.c.i0()) {
            return;
        }
        tlgVar.h.p(this.v);
        tlgVar.i.p(this.w);
    }

    public final void U() {
        RecyclerView recyclerView;
        if (this.q.isEmpty() || this.r != null || (recyclerView = this.e) == null) {
            return;
        }
        bn7 bn7Var = new bn7((Object) this, (byte) 21);
        this.r = bn7Var;
        recyclerView.post(bn7Var);
    }

    public final void V(tta ttaVar) {
        if (this.g.equals(ttaVar)) {
            return;
        }
        this.g = ttaVar;
    }

    public void W() {
        tlg tlgVar = this.x;
        if (tlgVar == null || !this.c.i0()) {
            return;
        }
        tlgVar.h.k(this.v);
        tlgVar.i.k(this.w);
    }

    public final void X(vr8 vr8Var) {
        if (this.h.equals(vr8Var)) {
            return;
        }
        this.h = vr8Var;
        if (this.e != null) {
            for (int i = 0; i < this.e.getChildCount(); i++) {
                RecyclerView recyclerView = this.e;
                es8 es8Var = (es8) recyclerView.T(recyclerView.getChildAt(i));
                if (es8Var != null) {
                    es8Var.b.p(this.h);
                }
            }
        }
    }

    public final void Y(tq8 tq8Var, boolean z) {
        RecyclerView recyclerView = this.e;
        if (recyclerView == null) {
            return;
        }
        i3j i3jVar = new i3j(recyclerView, this, tq8Var);
        r9i r9iVar = this.f;
        qr8 qr8Var = this.b;
        SettingsManager settingsManager = (SettingsManager) qr8Var.e.b.get();
        orm ormVar = (orm) qr8Var.c.b.get();
        skm skmVar = (skm) qr8Var.d.b.get();
        mdh mdhVar = (mdh) qr8Var.f.b.get();
        qdh qdhVar = (qdh) qr8Var.g.b.get();
        nv2 nv2Var = (nv2) qr8Var.h.get();
        tlg tlgVar = qr8Var.j;
        zzj zzjVar = (zzj) qr8Var.k.b.get();
        jvj jvjVar = (jvj) qr8Var.l.get();
        x77 x77Var = new x77(tq8Var, skmVar, qdhVar, false, (byte) 10);
        boolean z2 = this.d;
        ar8 ar8Var = new ar8(i3jVar, r9iVar, tq8Var, new vq8(tq8Var, settingsManager, z2, ormVar, skmVar, mdhVar, qdhVar, qr8Var, nv2Var, tlgVar, zzjVar, this.z), x77Var, jvjVar);
        Bundle bundle = new Bundle();
        bundle.putBoolean("editable", z2);
        bundle.putBoolean("focus", z);
        ar8Var.setArguments(bundle);
        zhj.a(ar8Var, 0).c(qr8Var.a);
    }

    public final void Z(pzj pzjVar, boolean z) {
        s9i s9iVar = this.c;
        ArrayList arrayList = (ArrayList) s9iVar.c;
        ArrayList arrayList2 = (ArrayList) s9iVar.c;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            gyj gyjVar = (gyj) obj;
            gyjVar.b.H(gyjVar.d);
        }
        int i3 = pzjVar == pzj.a ? 2131362852 : 2131362853;
        if (s9iVar.i0()) {
            arrayList2.clear();
            if (z) {
                arrayList2.add(new gyj(i3, this.m, new dg7(s9iVar, (byte) 13)));
            }
            s9iVar.k0(arrayList2.stream().anyMatch(new nn((byte) 6)));
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            gyj gyjVar2 = (gyj) obj2;
            gyjVar2.b.F(gyjVar2.d);
        }
    }

    @Override // defpackage.sj7
    public final void c(i iVar) {
        w7d.d(iVar.itemView, lf1.b, this.j.d ? 0L : 100L, 1.12f);
        this.a = true;
        s9i s9iVar = this.c;
        ((ns8) s9iVar.e).notifyItemRangeChanged(((tq8) s9iVar.b).e.size(), ((ArrayList) s9iVar.d).size());
        h7f h7fVar = this.k;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((sj7) g7fVarH.next()).c(iVar);
        }
    }

    public final int getItemCount() {
        s9i s9iVar = this.c;
        return ((ArrayList) s9iVar.d).size() + ((tq8) s9iVar.b).e.size();
    }

    public final long getItemId(int i) {
        tq8 tq8Var = (tq8) this.c.b;
        return i >= tq8Var.e.size() ? r2.R(i) : tq8Var.u(i).e();
    }

    public final int getItemViewType(int i) {
        return this.c.R(i);
    }

    @Override // defpackage.sj7
    public final void o(i iVar) {
        w7d.d(iVar.itemView, lf1.a, 150L, 1.0f);
        this.a = false;
        s9i s9iVar = this.c;
        ((ns8) s9iVar.e).notifyItemRangeChanged(((tq8) s9iVar.b).e.size(), ((ArrayList) s9iVar.d).size());
        h7f h7fVar = this.k;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((sj7) g7fVarH.next()).o(iVar);
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.e = recyclerView;
        s9i s9iVar = this.c;
        ArrayList arrayList = (ArrayList) s9iVar.c;
        tq8 tq8Var = (tq8) s9iVar.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gyj gyjVar = (gyj) obj;
            gyjVar.b.F(gyjVar.d);
        }
        tq8Var.F(this);
        tq8Var.b(this);
        W();
        flb flbVar = this.j;
        if (flbVar != null) {
            flbVar.e(recyclerView);
        }
    }

    public final void onBindViewHolder(i iVar, int i) {
        es8 es8Var = (es8) iVar;
        if (this.t) {
            this.q.put(es8Var, Boolean.FALSE);
        }
        vr8 vr8Var = this.h;
        es8Var.d = this;
        fr8 fr8Var = es8Var.b;
        fr8Var.p(vr8Var);
        fr8Var.m = false;
        vml.d(es8Var.c, 10000L);
        ds8 ds8Var = new ds8(es8Var, (byte) 0);
        if (fr8Var.m) {
            ds8Var.run();
        } else {
            fr8Var.n = ds8Var;
        }
        if (es8Var instanceof fs8) {
            ((fs8) es8Var).Z(((tq8) this.c.b).u(i));
        } else if (es8Var instanceof ms8) {
            ((i) ((ms8) es8Var)).itemView.setVisibility(this.a ? (byte) 4 : (byte) 0);
            es8Var.X();
        } else {
            es8Var.X();
        }
        if (this.t) {
            return;
        }
        es8Var.V();
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        fr8 dr8Var;
        zzj zzjVar = this.y;
        if (i == 2131362851) {
            return new ls8(new er8(viewGroup.getContext(), this.g, this.h, zzjVar));
        }
        if (i == 2131362849) {
            return new is8(new cr8(viewGroup.getContext(), this.g, this.h, zzjVar));
        }
        if (i != 2131362853 && i != 2131362852) {
            if (i == 2131362856) {
                return new ls8(new znk(viewGroup.getContext(), this.g, this.h));
            }
            if (i == 2131362855) {
                return new ls8(new rch(viewGroup.getContext(), this.l, this.g, this.h));
            }
            return null;
        }
        int iOrdinal = (i == 2131362852 ? pzj.a : pzj.b).ordinal();
        if (iOrdinal == 0) {
            dr8Var = new dr8(viewGroup.getContext(), this.g, this.h);
        } else {
            if (iOrdinal != 1) {
                throw new RuntimeException(null, null);
            }
            dr8Var = new jx(viewGroup.getContext(), new lf5((byte) 10), this.g, this.h);
        }
        return new ms8(i, dr8Var, this.b);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.e = null;
        T();
        s9i s9iVar = this.c;
        ArrayList arrayList = (ArrayList) s9iVar.c;
        tq8 tq8Var = (tq8) s9iVar.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gyj gyjVar = (gyj) obj;
            gyjVar.b.H(gyjVar.d);
        }
        tq8Var.H(this);
        tq8Var.o(this);
        flb flbVar = this.j;
        if (flbVar != null) {
            flbVar.e(null);
        }
    }

    public final boolean onFailedToRecycleView(i iVar) {
        ((i) ((es8) iVar)).itemView.animate().cancel();
        return true;
    }

    public final void onViewAttachedToWindow(i iVar) {
        hq8 hq8Var;
        es8 es8Var = (es8) iVar;
        super.onViewAttachedToWindow(es8Var);
        flb flbVar = this.j;
        if (flbVar == null || !(es8Var instanceof fs8)) {
            return;
        }
        fs8 fs8Var = (fs8) es8Var;
        vi7 vi7Var = this.i;
        fs8 fs8Var2 = vi7Var == null ? null : (fs8) vi7Var.i;
        if (fs8Var2 == null || (hq8Var = fs8Var2.f) == null || !hq8Var.equals(fs8Var.f)) {
            return;
        }
        float f = flbVar.l;
        float f2 = flbVar.e;
        float f3 = f + f2;
        float f4 = flbVar.m;
        float f5 = flbVar.f;
        float f6 = f4 + f5;
        float f7 = f2 - flbVar.n;
        float f8 = f5 - flbVar.o;
        flbVar.s(es8Var);
        flbVar.e = f3;
        flbVar.f = f6;
        flbVar.n = f3 - f7;
        flbVar.o = f6 - f8;
    }

    public final void onViewRecycled(i iVar) {
        es8 es8Var = (es8) iVar;
        super.onViewRecycled(es8Var);
        this.q.remove(es8Var);
        if (es8Var instanceof fs8) {
            ((fs8) es8Var).Z(null);
        }
        vml.a(es8Var.c);
        es8Var.d = null;
        U();
    }

    @Override // defpackage.gq8
    public final void r(int i, hq8 hq8Var) {
        int iK;
        if (!hq8Var.b.equals((tq8) this.c.b) || (iK = K(hq8Var)) < 0 || iK >= getItemCount()) {
            return;
        }
        notifyItemChanged(iK);
    }

    @Override // defpackage.sq8
    public final void u(int i, hq8 hq8Var) {
        notifyItemMoved(i, K(hq8Var));
    }

    @Override // defpackage.sq8
    public final void w(hq8 hq8Var) {
        notifyItemInserted(K(hq8Var));
    }
}
