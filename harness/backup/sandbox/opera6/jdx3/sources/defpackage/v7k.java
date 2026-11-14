package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class v7k extends i93 implements o37 {
    public static final /* synthetic */ xtb[] A = {new d6h(v7k.class, "binding", "getBinding()Lcom/opera/android/databinding/FragmentStartPageSettingsBinding;", 0), new d6h(v7k.class, "wallpaperAdapterHelper", "getWallpaperAdapterHelper()Lcom/opera/android/wallpaper/WallpaperHorizontalPreviewAdapterHelper;", 0), new d6h(v7k.class, "wallpaperDelegate", "getWallpaperDelegate()Lcom/opera/android/wallpaper/adapter/WallpaperAdapter$Delegate;", 0)};
    public final ua7 t;
    public final ktl u;
    public final zyk v;
    public final zyk w;
    public List x;
    public final jp3 y;
    public final jp3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7k(gjm gjmVar) {
        super(2132021418, 0, 14);
        final byte b = 0;
        this.t = new ua7((Fragment) this, gjmVar);
        this.u = F0(new a3j((byte) 12));
        this.v = z4c.b(new yse(this, (byte) 16));
        this.w = z4c.b(new Function0(this) { // from class: n7k
            public final /* synthetic */ v7k b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                Fragment fragment = this.b;
                switch (b2) {
                    case 0:
                        return ((m7k) fragment.t.p()).a;
                    case 1:
                        vkn vknVar = new vkn(fragment.I0().e, fragment.H0().n, new vjn(fragment.H0().a.getContext(), true, true), fragment.getResources().getDimensionPixelSize(2131165520), fragment.getResources().getDimensionPixelSize(2131165521), (tjn) fragment.z.a(fragment, v7k.A[2]));
                        RecyclerView recyclerView = fragment.H0().n;
                        kkf kkfVar = new kkf(vknVar, (byte) 24);
                        dll dllVarS = q9n.s(recyclerView);
                        if (dllVarS != null) {
                            u8n.b(dllVarS, recyclerView, kkfVar);
                        }
                        return vknVar;
                    default:
                        return new p7k(fragment);
                }
            }
        });
        this.x = l08.a;
        final byte b2 = 1;
        this.y = new jp3(new Function0(this) { // from class: n7k
            public final /* synthetic */ v7k b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                Fragment fragment = this.b;
                switch (b22) {
                    case 0:
                        return ((m7k) fragment.t.p()).a;
                    case 1:
                        vkn vknVar = new vkn(fragment.I0().e, fragment.H0().n, new vjn(fragment.H0().a.getContext(), true, true), fragment.getResources().getDimensionPixelSize(2131165520), fragment.getResources().getDimensionPixelSize(2131165521), (tjn) fragment.z.a(fragment, v7k.A[2]));
                        RecyclerView recyclerView = fragment.H0().n;
                        kkf kkfVar = new kkf(vknVar, (byte) 24);
                        dll dllVarS = q9n.s(recyclerView);
                        if (dllVarS != null) {
                            u8n.b(dllVarS, recyclerView, kkfVar);
                        }
                        return vknVar;
                    default:
                        return new p7k(fragment);
                }
            }
        });
        final byte b3 = 2;
        this.z = new jp3(new Function0(this) { // from class: n7k
            public final /* synthetic */ v7k b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b3;
                Fragment fragment = this.b;
                switch (b22) {
                    case 0:
                        return ((m7k) fragment.t.p()).a;
                    case 1:
                        vkn vknVar = new vkn(fragment.I0().e, fragment.H0().n, new vjn(fragment.H0().a.getContext(), true, true), fragment.getResources().getDimensionPixelSize(2131165520), fragment.getResources().getDimensionPixelSize(2131165521), (tjn) fragment.z.a(fragment, v7k.A[2]));
                        RecyclerView recyclerView = fragment.H0().n;
                        kkf kkfVar = new kkf(vknVar, (byte) 24);
                        dll dllVarS = q9n.s(recyclerView);
                        if (dllVarS != null) {
                            u8n.b(dllVarS, recyclerView, kkfVar);
                        }
                        return vknVar;
                    default:
                        return new p7k(fragment);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void J0(OperaListItem operaListItem, yt8 yt8Var) {
        operaListItem.setVisibility(yt8Var.a ? 0 : 8);
        operaListItem.t(yt8Var.b);
    }

    @Override // defpackage.i93
    public final h93 G0() {
        return I0();
    }

    public final sm9 H0() {
        xtb xtbVar = A[0];
        a5n a5nVar = this.u.b;
        Objects.requireNonNull(a5nVar);
        return (sm9) a5nVar;
    }

    public final c8k I0() {
        return (c8k) this.v.getValue();
    }

    @Override // defpackage.i93, defpackage.k24
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final byte b = 0;
        H0().l.setOnClickListener(new View.OnClickListener(this) { // from class: o7k
            public final /* synthetic */ v7k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b2 = b;
                v7k v7kVar = this.b;
                switch (b2) {
                    case 0:
                        v7kVar.I0().f.b.e(new rkn(vln.b, null), false);
                        break;
                    case 1:
                        ((g8j) v7kVar.I0().c).i(new int[0]);
                        break;
                    default:
                        v7kVar.I0().g.a(new int[0]);
                        break;
                }
            }
        });
        H0().g.u = new s7k(this, (byte) 0);
        H0().m.u = new t7k(this, (byte) 0);
        final byte b2 = 1;
        H0().j.setOnClickListener(new View.OnClickListener(this) { // from class: o7k
            public final /* synthetic */ v7k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b2;
                v7k v7kVar = this.b;
                switch (b22) {
                    case 0:
                        v7kVar.I0().f.b.e(new rkn(vln.b, null), false);
                        break;
                    case 1:
                        ((g8j) v7kVar.I0().c).i(new int[0]);
                        break;
                    default:
                        v7kVar.I0().g.a(new int[0]);
                        break;
                }
            }
        });
        final byte b3 = 2;
        H0().f.setOnClickListener(new View.OnClickListener(this) { // from class: o7k
            public final /* synthetic */ v7k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b22 = b3;
                v7k v7kVar = this.b;
                switch (b22) {
                    case 0:
                        v7kVar.I0().f.b.e(new rkn(vln.b, null), false);
                        break;
                    case 1:
                        ((g8j) v7kVar.I0().c).i(new int[0]);
                        break;
                    default:
                        v7kVar.I0().g.a(new int[0]);
                        break;
                }
            }
        });
        H0().j.u = new qie(this, (byte) 25);
        H0().k.u = new u7k(this);
        H0().d.u = new z4k(this, (byte) 1);
        H0().e.u = new q7k(this, b2);
        H0().h.u = new r7k(this, b2);
        H0().i.u = new s7k(this, (byte) 1);
        H0().b.u = new t7k(this, (byte) 1);
        H0().f.u = new q7k(this, b);
        H0().c.u = new r7k(this, b);
        if (!this.x.isEmpty()) {
            vkn vknVar = (vkn) this.y.a(this, A[1]);
            vknVar.a.T(this.x);
            vknVar.b.x0(0);
        }
        xf8.i0(I0().d.n, getViewLifecycleOwner(), H0().a, (List) null, new w4i(this, (byte) 10));
    }

    @Override // defpackage.o37
    public final ua7 r() {
        return this.t;
    }
}
