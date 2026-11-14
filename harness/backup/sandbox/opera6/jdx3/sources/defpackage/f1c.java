package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.SeparatorView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.SettingsManager;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class f1c extends i93 {
    public final ode A;
    public cr2 B;
    public final x0c t;
    public final j1c u;
    public final g0c v;
    public final b1c w;
    public final SettingsManager x;
    public final q6e y;
    public final v3m z;

    public f1c(SettingsManager settingsManager, q6e q6eVar, j1c j1cVar, v3m v3mVar, g0c g0cVar) {
        super(2132021237);
        this.t = new x0c(this, (byte) 0);
        this.w = new b1c(this);
        this.x = settingsManager;
        this.y = q6eVar;
        this.u = j1cVar;
        this.z = v3mVar;
        this.v = g0cVar;
        this.A = (ode) v3mVar.d.c;
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return this.t;
    }

    @Override // defpackage.ltl, defpackage.k24
    public final void onDestroyView() {
        this.B = null;
        super.onDestroyView();
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final byte b = 4;
        ((LinearLayout) this.B.g).getLayoutTransition().enableTransitionType(4);
        final byte b2 = 3;
        ((LinearLayout) this.B.g).getLayoutTransition().disableTransitionType(3);
        v3m v3mVar = this.z;
        final byte b3 = 0;
        int i = v3m.f(v3mVar.a) ? 0 : 8;
        ((SeparatorView) this.B.e).setVisibility(i);
        ((StylingTextView) this.B.b).setVisibility(i);
        ((OperaListItem) this.B.l).setVisibility(i);
        xf8.i0((v9j) this.u.e, getViewLifecycleOwner(), (LinearLayout) this.B.g, (List) null, new ks6(this, (byte) 21));
        final byte b4 = 1;
        ((OperaListItem) this.B.d).setOnClickListener(new View.OnClickListener(this) { // from class: y0c
            public final /* synthetic */ f1c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HashSet hashSet;
                byte b5 = b4;
                f1c f1cVar = this.b;
                switch (b5) {
                    case 0:
                        g0c g0cVar = f1cVar.v;
                        zhj.a(new p3m((v3m) g0cVar.b.b.get()), 4099).c(g0cVar.a);
                        break;
                    case 1:
                        g0c g0cVar2 = f1cVar.v;
                        g0cVar2.getClass();
                        zhj.a(new a0c(), 4099).c(g0cVar2.a);
                        break;
                    case 2:
                        g0c g0cVar3 = f1cVar.v;
                        g0cVar3.getClass();
                        zhj.b(rbn.class).c(g0cVar3.a);
                        break;
                    case 3:
                        fp1 fp1Var = f1cVar.v.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            f1cVar.n.f(new glj(new rxh(2132020203), 2500));
                            return;
                        }
                    case 4:
                        z4m z4mVarE = f1cVar.x.E();
                        z77 z77VarU = sfe.U(((LinearLayout) f1cVar.B.g).getContext());
                        bg7 bg7Var = new bg7(f1cVar.y, z4mVarE, new ge5(f1cVar, z4mVarE, (byte) 29));
                        z77VarU.getClass();
                        z77VarU.b(bg7Var, ijm.b);
                        break;
                    case 5:
                        g0c g0cVar4 = f1cVar.v;
                        v3m v3mVar2 = (v3m) g0cVar4.b.b.get();
                        fp1 fp1Var2 = g0cVar4.a;
                        zhj.a(new u3m(2132021147, v3m.c(fp1Var2), new f0c(v3mVar2), v3mVar2.d(), nb6.J(sfe.Q(v3m.c(v3mVar2.a), new f15(v3mVar2, (byte) 5)))), 4099).c(fp1Var2);
                        break;
                    default:
                        Iterable hashSet2 = (Set) f1cVar.A.g();
                        if (hashSet2 == null) {
                            hashSet2 = new HashSet();
                        }
                        byte b6 = 1;
                        Collection zlbVar = new zlb(hashSet2, new b10((byte) 15), (byte) 1);
                        if (zlbVar instanceof Collection) {
                            hashSet = new HashSet(zlbVar);
                        } else {
                            Iterator it = zlbVar.iterator();
                            HashSet hashSet3 = new HashSet();
                            ipe.f(hashSet3, it);
                            hashSet = hashSet3;
                        }
                        HashSet hashSet4 = new HashSet();
                        for (szb szbVar : v3m.c(f1cVar.requireContext())) {
                            if (!hashSet.contains(szbVar)) {
                                hashSet4.add(szbVar);
                            }
                        }
                        zhj.a(new u3m(2132021074, hashSet4, new x0c(f1cVar, b6), null, null), 4099).c(view2.getContext());
                        break;
                }
            }
        });
        final byte b5 = 2;
        ((OperaListItem) this.B.n).setOnClickListener(new View.OnClickListener(this) { // from class: y0c
            public final /* synthetic */ f1c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HashSet hashSet;
                byte b52 = b5;
                f1c f1cVar = this.b;
                switch (b52) {
                    case 0:
                        g0c g0cVar = f1cVar.v;
                        zhj.a(new p3m((v3m) g0cVar.b.b.get()), 4099).c(g0cVar.a);
                        break;
                    case 1:
                        g0c g0cVar2 = f1cVar.v;
                        g0cVar2.getClass();
                        zhj.a(new a0c(), 4099).c(g0cVar2.a);
                        break;
                    case 2:
                        g0c g0cVar3 = f1cVar.v;
                        g0cVar3.getClass();
                        zhj.b(rbn.class).c(g0cVar3.a);
                        break;
                    case 3:
                        fp1 fp1Var = f1cVar.v.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            f1cVar.n.f(new glj(new rxh(2132020203), 2500));
                            return;
                        }
                    case 4:
                        z4m z4mVarE = f1cVar.x.E();
                        z77 z77VarU = sfe.U(((LinearLayout) f1cVar.B.g).getContext());
                        bg7 bg7Var = new bg7(f1cVar.y, z4mVarE, new ge5(f1cVar, z4mVarE, (byte) 29));
                        z77VarU.getClass();
                        z77VarU.b(bg7Var, ijm.b);
                        break;
                    case 5:
                        g0c g0cVar4 = f1cVar.v;
                        v3m v3mVar2 = (v3m) g0cVar4.b.b.get();
                        fp1 fp1Var2 = g0cVar4.a;
                        zhj.a(new u3m(2132021147, v3m.c(fp1Var2), new f0c(v3mVar2), v3mVar2.d(), nb6.J(sfe.Q(v3m.c(v3mVar2.a), new f15(v3mVar2, (byte) 5)))), 4099).c(fp1Var2);
                        break;
                    default:
                        Iterable hashSet2 = (Set) f1cVar.A.g();
                        if (hashSet2 == null) {
                            hashSet2 = new HashSet();
                        }
                        byte b6 = 1;
                        Collection zlbVar = new zlb(hashSet2, new b10((byte) 15), (byte) 1);
                        if (zlbVar instanceof Collection) {
                            hashSet = new HashSet(zlbVar);
                        } else {
                            Iterator it = zlbVar.iterator();
                            HashSet hashSet3 = new HashSet();
                            ipe.f(hashSet3, it);
                            hashSet = hashSet3;
                        }
                        HashSet hashSet4 = new HashSet();
                        for (szb szbVar : v3m.c(f1cVar.requireContext())) {
                            if (!hashSet.contains(szbVar)) {
                                hashSet4.add(szbVar);
                            }
                        }
                        zhj.a(new u3m(2132021074, hashSet4, new x0c(f1cVar, b6), null, null), 4099).c(view2.getContext());
                        break;
                }
            }
        });
        ((OperaListItem) this.B.n).w(new View.OnClickListener(this) { // from class: y0c
            public final /* synthetic */ f1c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HashSet hashSet;
                byte b52 = b2;
                f1c f1cVar = this.b;
                switch (b52) {
                    case 0:
                        g0c g0cVar = f1cVar.v;
                        zhj.a(new p3m((v3m) g0cVar.b.b.get()), 4099).c(g0cVar.a);
                        break;
                    case 1:
                        g0c g0cVar2 = f1cVar.v;
                        g0cVar2.getClass();
                        zhj.a(new a0c(), 4099).c(g0cVar2.a);
                        break;
                    case 2:
                        g0c g0cVar3 = f1cVar.v;
                        g0cVar3.getClass();
                        zhj.b(rbn.class).c(g0cVar3.a);
                        break;
                    case 3:
                        fp1 fp1Var = f1cVar.v.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            f1cVar.n.f(new glj(new rxh(2132020203), 2500));
                            return;
                        }
                    case 4:
                        z4m z4mVarE = f1cVar.x.E();
                        z77 z77VarU = sfe.U(((LinearLayout) f1cVar.B.g).getContext());
                        bg7 bg7Var = new bg7(f1cVar.y, z4mVarE, new ge5(f1cVar, z4mVarE, (byte) 29));
                        z77VarU.getClass();
                        z77VarU.b(bg7Var, ijm.b);
                        break;
                    case 5:
                        g0c g0cVar4 = f1cVar.v;
                        v3m v3mVar2 = (v3m) g0cVar4.b.b.get();
                        fp1 fp1Var2 = g0cVar4.a;
                        zhj.a(new u3m(2132021147, v3m.c(fp1Var2), new f0c(v3mVar2), v3mVar2.d(), nb6.J(sfe.Q(v3m.c(v3mVar2.a), new f15(v3mVar2, (byte) 5)))), 4099).c(fp1Var2);
                        break;
                    default:
                        Iterable hashSet2 = (Set) f1cVar.A.g();
                        if (hashSet2 == null) {
                            hashSet2 = new HashSet();
                        }
                        byte b6 = 1;
                        Collection zlbVar = new zlb(hashSet2, new b10((byte) 15), (byte) 1);
                        if (zlbVar instanceof Collection) {
                            hashSet = new HashSet(zlbVar);
                        } else {
                            Iterator it = zlbVar.iterator();
                            HashSet hashSet3 = new HashSet();
                            ipe.f(hashSet3, it);
                            hashSet = hashSet3;
                        }
                        HashSet hashSet4 = new HashSet();
                        for (szb szbVar : v3m.c(f1cVar.requireContext())) {
                            if (!hashSet.contains(szbVar)) {
                                hashSet4.add(szbVar);
                            }
                        }
                        zhj.a(new u3m(2132021074, hashSet4, new x0c(f1cVar, b6), null, null), 4099).c(view2.getContext());
                        break;
                }
            }
        });
        OperaListItem operaListItem = (OperaListItem) this.B.n;
        operaListItem.z = new rxh(2132021799);
        operaListItem.u();
        ((OperaListItem) this.B.l).setOnClickListener(new View.OnClickListener(this) { // from class: y0c
            public final /* synthetic */ f1c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HashSet hashSet;
                byte b52 = b;
                f1c f1cVar = this.b;
                switch (b52) {
                    case 0:
                        g0c g0cVar = f1cVar.v;
                        zhj.a(new p3m((v3m) g0cVar.b.b.get()), 4099).c(g0cVar.a);
                        break;
                    case 1:
                        g0c g0cVar2 = f1cVar.v;
                        g0cVar2.getClass();
                        zhj.a(new a0c(), 4099).c(g0cVar2.a);
                        break;
                    case 2:
                        g0c g0cVar3 = f1cVar.v;
                        g0cVar3.getClass();
                        zhj.b(rbn.class).c(g0cVar3.a);
                        break;
                    case 3:
                        fp1 fp1Var = f1cVar.v.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            f1cVar.n.f(new glj(new rxh(2132020203), 2500));
                            return;
                        }
                    case 4:
                        z4m z4mVarE = f1cVar.x.E();
                        z77 z77VarU = sfe.U(((LinearLayout) f1cVar.B.g).getContext());
                        bg7 bg7Var = new bg7(f1cVar.y, z4mVarE, new ge5(f1cVar, z4mVarE, (byte) 29));
                        z77VarU.getClass();
                        z77VarU.b(bg7Var, ijm.b);
                        break;
                    case 5:
                        g0c g0cVar4 = f1cVar.v;
                        v3m v3mVar2 = (v3m) g0cVar4.b.b.get();
                        fp1 fp1Var2 = g0cVar4.a;
                        zhj.a(new u3m(2132021147, v3m.c(fp1Var2), new f0c(v3mVar2), v3mVar2.d(), nb6.J(sfe.Q(v3m.c(v3mVar2.a), new f15(v3mVar2, (byte) 5)))), 4099).c(fp1Var2);
                        break;
                    default:
                        Iterable hashSet2 = (Set) f1cVar.A.g();
                        if (hashSet2 == null) {
                            hashSet2 = new HashSet();
                        }
                        byte b6 = 1;
                        Collection zlbVar = new zlb(hashSet2, new b10((byte) 15), (byte) 1);
                        if (zlbVar instanceof Collection) {
                            hashSet = new HashSet(zlbVar);
                        } else {
                            Iterator it = zlbVar.iterator();
                            HashSet hashSet3 = new HashSet();
                            ipe.f(hashSet3, it);
                            hashSet = hashSet3;
                        }
                        HashSet hashSet4 = new HashSet();
                        for (szb szbVar : v3m.c(f1cVar.requireContext())) {
                            if (!hashSet.contains(szbVar)) {
                                hashSet4.add(szbVar);
                            }
                        }
                        zhj.a(new u3m(2132021074, hashSet4, new x0c(f1cVar, b6), null, null), 4099).c(view2.getContext());
                        break;
                }
            }
        });
        cr2 cr2Var = this.B;
        ((OperaListItem) cr2Var.i).u = new x0c(this, b5);
        final byte b6 = 5;
        ((OperaListItem) cr2Var.c).setOnClickListener(new View.OnClickListener(this) { // from class: y0c
            public final /* synthetic */ f1c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HashSet hashSet;
                byte b52 = b6;
                f1c f1cVar = this.b;
                switch (b52) {
                    case 0:
                        g0c g0cVar = f1cVar.v;
                        zhj.a(new p3m((v3m) g0cVar.b.b.get()), 4099).c(g0cVar.a);
                        break;
                    case 1:
                        g0c g0cVar2 = f1cVar.v;
                        g0cVar2.getClass();
                        zhj.a(new a0c(), 4099).c(g0cVar2.a);
                        break;
                    case 2:
                        g0c g0cVar3 = f1cVar.v;
                        g0cVar3.getClass();
                        zhj.b(rbn.class).c(g0cVar3.a);
                        break;
                    case 3:
                        fp1 fp1Var = f1cVar.v.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            f1cVar.n.f(new glj(new rxh(2132020203), 2500));
                            return;
                        }
                    case 4:
                        z4m z4mVarE = f1cVar.x.E();
                        z77 z77VarU = sfe.U(((LinearLayout) f1cVar.B.g).getContext());
                        bg7 bg7Var = new bg7(f1cVar.y, z4mVarE, new ge5(f1cVar, z4mVarE, (byte) 29));
                        z77VarU.getClass();
                        z77VarU.b(bg7Var, ijm.b);
                        break;
                    case 5:
                        g0c g0cVar4 = f1cVar.v;
                        v3m v3mVar2 = (v3m) g0cVar4.b.b.get();
                        fp1 fp1Var2 = g0cVar4.a;
                        zhj.a(new u3m(2132021147, v3m.c(fp1Var2), new f0c(v3mVar2), v3mVar2.d(), nb6.J(sfe.Q(v3m.c(v3mVar2.a), new f15(v3mVar2, (byte) 5)))), 4099).c(fp1Var2);
                        break;
                    default:
                        Iterable hashSet2 = (Set) f1cVar.A.g();
                        if (hashSet2 == null) {
                            hashSet2 = new HashSet();
                        }
                        byte b62 = 1;
                        Collection zlbVar = new zlb(hashSet2, new b10((byte) 15), (byte) 1);
                        if (zlbVar instanceof Collection) {
                            hashSet = new HashSet(zlbVar);
                        } else {
                            Iterator it = zlbVar.iterator();
                            HashSet hashSet3 = new HashSet();
                            ipe.f(hashSet3, it);
                            hashSet = hashSet3;
                        }
                        HashSet hashSet4 = new HashSet();
                        for (szb szbVar : v3m.c(f1cVar.requireContext())) {
                            if (!hashSet.contains(szbVar)) {
                                hashSet4.add(szbVar);
                            }
                        }
                        zhj.a(new u3m(2132021074, hashSet4, new x0c(f1cVar, b62), null, null), 4099).c(view2.getContext());
                        break;
                }
            }
        });
        RecyclerView recyclerView = this.B.j;
        recyclerView.getContext();
        recyclerView.C0(new LinearLayoutManager());
        recyclerView.y0(this.w);
        final byte b7 = 6;
        ((MaterialButton) this.B.h).setOnClickListener(new View.OnClickListener(this) { // from class: y0c
            public final /* synthetic */ f1c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HashSet hashSet;
                byte b52 = b7;
                f1c f1cVar = this.b;
                switch (b52) {
                    case 0:
                        g0c g0cVar = f1cVar.v;
                        zhj.a(new p3m((v3m) g0cVar.b.b.get()), 4099).c(g0cVar.a);
                        break;
                    case 1:
                        g0c g0cVar2 = f1cVar.v;
                        g0cVar2.getClass();
                        zhj.a(new a0c(), 4099).c(g0cVar2.a);
                        break;
                    case 2:
                        g0c g0cVar3 = f1cVar.v;
                        g0cVar3.getClass();
                        zhj.b(rbn.class).c(g0cVar3.a);
                        break;
                    case 3:
                        fp1 fp1Var = f1cVar.v.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            f1cVar.n.f(new glj(new rxh(2132020203), 2500));
                            return;
                        }
                    case 4:
                        z4m z4mVarE = f1cVar.x.E();
                        z77 z77VarU = sfe.U(((LinearLayout) f1cVar.B.g).getContext());
                        bg7 bg7Var = new bg7(f1cVar.y, z4mVarE, new ge5(f1cVar, z4mVarE, (byte) 29));
                        z77VarU.getClass();
                        z77VarU.b(bg7Var, ijm.b);
                        break;
                    case 5:
                        g0c g0cVar4 = f1cVar.v;
                        v3m v3mVar2 = (v3m) g0cVar4.b.b.get();
                        fp1 fp1Var2 = g0cVar4.a;
                        zhj.a(new u3m(2132021147, v3m.c(fp1Var2), new f0c(v3mVar2), v3mVar2.d(), nb6.J(sfe.Q(v3m.c(v3mVar2.a), new f15(v3mVar2, (byte) 5)))), 4099).c(fp1Var2);
                        break;
                    default:
                        Iterable hashSet2 = (Set) f1cVar.A.g();
                        if (hashSet2 == null) {
                            hashSet2 = new HashSet();
                        }
                        byte b62 = 1;
                        Collection zlbVar = new zlb(hashSet2, new b10((byte) 15), (byte) 1);
                        if (zlbVar instanceof Collection) {
                            hashSet = new HashSet(zlbVar);
                        } else {
                            Iterator it = zlbVar.iterator();
                            HashSet hashSet3 = new HashSet();
                            ipe.f(hashSet3, it);
                            hashSet = hashSet3;
                        }
                        HashSet hashSet4 = new HashSet();
                        for (szb szbVar : v3m.c(f1cVar.requireContext())) {
                            if (!hashSet.contains(szbVar)) {
                                hashSet4.add(szbVar);
                            }
                        }
                        zhj.a(new u3m(2132021074, hashSet4, new x0c(f1cVar, b62), null, null), 4099).c(view2.getContext());
                        break;
                }
            }
        });
        v0g.m((OperaListItem) this.B.f, v3mVar.a(2132017997));
        cr2 cr2Var2 = this.B;
        ((OperaListItem) cr2Var2.f).u = new x0c(this, b2);
        ((OperaListItem) cr2Var2.k).setOnClickListener(new View.OnClickListener(this) { // from class: y0c
            public final /* synthetic */ f1c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HashSet hashSet;
                byte b52 = b3;
                f1c f1cVar = this.b;
                switch (b52) {
                    case 0:
                        g0c g0cVar = f1cVar.v;
                        zhj.a(new p3m((v3m) g0cVar.b.b.get()), 4099).c(g0cVar.a);
                        break;
                    case 1:
                        g0c g0cVar2 = f1cVar.v;
                        g0cVar2.getClass();
                        zhj.a(new a0c(), 4099).c(g0cVar2.a);
                        break;
                    case 2:
                        g0c g0cVar3 = f1cVar.v;
                        g0cVar3.getClass();
                        zhj.b(rbn.class).c(g0cVar3.a);
                        break;
                    case 3:
                        fp1 fp1Var = f1cVar.v.a;
                        try {
                            Intent intent = new Intent();
                            intent.setAction("com.android.settings.TTS_SETTINGS");
                            intent.setFlags(268435456);
                            fp1Var.startActivity(intent);
                            break;
                        } catch (ActivityNotFoundException unused) {
                            f1cVar.n.f(new glj(new rxh(2132020203), 2500));
                            return;
                        }
                    case 4:
                        z4m z4mVarE = f1cVar.x.E();
                        z77 z77VarU = sfe.U(((LinearLayout) f1cVar.B.g).getContext());
                        bg7 bg7Var = new bg7(f1cVar.y, z4mVarE, new ge5(f1cVar, z4mVarE, (byte) 29));
                        z77VarU.getClass();
                        z77VarU.b(bg7Var, ijm.b);
                        break;
                    case 5:
                        g0c g0cVar4 = f1cVar.v;
                        v3m v3mVar2 = (v3m) g0cVar4.b.b.get();
                        fp1 fp1Var2 = g0cVar4.a;
                        zhj.a(new u3m(2132021147, v3m.c(fp1Var2), new f0c(v3mVar2), v3mVar2.d(), nb6.J(sfe.Q(v3m.c(v3mVar2.a), new f15(v3mVar2, (byte) 5)))), 4099).c(fp1Var2);
                        break;
                    default:
                        Iterable hashSet2 = (Set) f1cVar.A.g();
                        if (hashSet2 == null) {
                            hashSet2 = new HashSet();
                        }
                        byte b62 = 1;
                        Collection zlbVar = new zlb(hashSet2, new b10((byte) 15), (byte) 1);
                        if (zlbVar instanceof Collection) {
                            hashSet = new HashSet(zlbVar);
                        } else {
                            Iterator it = zlbVar.iterator();
                            HashSet hashSet3 = new HashSet();
                            ipe.f(hashSet3, it);
                            hashSet = hashSet3;
                        }
                        HashSet hashSet4 = new HashSet();
                        for (szb szbVar : v3m.c(f1cVar.requireContext())) {
                            if (!hashSet.contains(szbVar)) {
                                hashSet4.add(szbVar);
                            }
                        }
                        zhj.a(new u3m(2132021074, hashSet4, new x0c(f1cVar, b62), null, null), 4099).c(view2.getContext());
                        break;
                }
            }
        });
    }

    @Override // defpackage.ltl
    public final void v0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super.v0(layoutInflater, viewGroup);
        View viewInflate = layoutInflater.inflate(2131559302, viewGroup, false);
        viewGroup.addView(viewInflate);
        int i = 2131361941;
        MaterialButton materialButtonJ = w1h.j(2131361941, viewInflate);
        if (materialButtonJ != null) {
            i = 2131362044;
            OperaListItem operaListItem = (OperaListItem) w1h.j(2131362044, viewInflate);
            if (operaListItem != null) {
                i = 2131362119;
                if (((SeparatorView) w1h.j(2131362119, viewInflate)) != null) {
                    i = 2131362120;
                    OperaListItem operaListItem2 = (OperaListItem) w1h.j(2131362120, viewInflate);
                    if (operaListItem2 != null) {
                        i = 2131362756;
                        if (((SeparatorView) w1h.j(2131362756, viewInflate)) != null) {
                            i = 2131362858;
                            OperaListItem operaListItem3 = (OperaListItem) w1h.j(2131362858, viewInflate);
                            if (operaListItem3 != null) {
                                i = 2131363303;
                                if (((StylingTextView) w1h.j(2131363303, viewInflate)) != null) {
                                    i = 2131363304;
                                    RecyclerView recyclerViewJ = w1h.j(2131363304, viewInflate);
                                    if (recyclerViewJ != null) {
                                        i = 2131363305;
                                        if (((SeparatorView) w1h.j(2131363305, viewInflate)) != null) {
                                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                                            i = 2131364234;
                                            OperaListItem operaListItem4 = (OperaListItem) w1h.j(2131364234, viewInflate);
                                            if (operaListItem4 != null) {
                                                i = 2131364844;
                                                OperaListItem operaListItem5 = (OperaListItem) w1h.j(2131364844, viewInflate);
                                                if (operaListItem5 != null) {
                                                    i = 2131364848;
                                                    StylingTextView stylingTextView = (StylingTextView) w1h.j(2131364848, viewInflate);
                                                    if (stylingTextView != null) {
                                                        i = 2131364849;
                                                        SeparatorView separatorView = (SeparatorView) w1h.j(2131364849, viewInflate);
                                                        if (separatorView != null) {
                                                            i = 2131364850;
                                                            OperaListItem operaListItem6 = (OperaListItem) w1h.j(2131364850, viewInflate);
                                                            if (operaListItem6 != null) {
                                                                i = 2131364851;
                                                                OperaIconedMessage operaIconedMessage = (OperaIconedMessage) w1h.j(2131364851, viewInflate);
                                                                if (operaIconedMessage != null) {
                                                                    i = 2131365030;
                                                                    OperaListItem operaListItem7 = (OperaListItem) w1h.j(2131365030, viewInflate);
                                                                    if (operaListItem7 != null) {
                                                                        this.B = new cr2(linearLayout, materialButtonJ, operaListItem, operaListItem2, operaListItem3, recyclerViewJ, operaListItem4, operaListItem5, stylingTextView, separatorView, operaListItem6, operaIconedMessage, operaListItem7);
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
