package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import java.lang.ref.WeakReference;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public final class ze7 extends d implements kkm {
    public xvj b;
    public jg7 c;
    public final tzi f;
    public final xbf h;
    public RecyclerView i;
    public vvj j;
    public kg7 k;
    public dg7 l;
    public WeakReference m;
    public vg7 n;
    public final ArrayList a = new ArrayList();
    public final bp d = new bp(new xe7(-1, false));
    public final bp e = new bp(new xe7(-2, true));
    public final we7 g = new we7(this, new ve7(this, (byte) 0), (byte) 0);

    public ze7(tzi tziVar, xbf xbfVar) {
        this.f = tziVar;
        this.h = xbfVar;
        setHasStableIds(true);
        this.b = new xvj(xe7.class, new ye7(this, vvj.c));
    }

    public final void G(List list) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            re7 re7Var = (re7) it.next();
            if (this.k != null) {
                int[][] iArr = lg7.a;
                kg7 kg7VarG = lg7.g(c5o.m().o(re7Var.f(), rf7.h(re7Var)));
                kg7 kg7Var = this.k;
                if (kg7VarG == kg7.m) {
                    if (kg7Var == kg7.l) {
                    }
                } else if (kg7Var == kg7VarG) {
                }
            }
            xe7 xe7Var = new xe7(re7Var);
            arrayList.add(xe7Var);
            boolean z = xe7Var.c;
            bp bpVar = this.d;
            bp bpVar2 = this.e;
            bp bpVar3 = z ? bpVar2 : bpVar;
            int i = bpVar3.a + 1;
            bpVar3.a = i;
            if (this.k == null && i == 1) {
                if (bpVar3 == bpVar) {
                    this.b.a((xe7) bpVar.b);
                    RecyclerView recyclerView = this.i;
                    if (recyclerView != null) {
                        recyclerView.x0(0);
                    }
                    if (bpVar2.a > 0) {
                        this.b.a((xe7) bpVar2.b);
                    }
                } else if (bpVar.a > 0) {
                    this.b.a((xe7) bpVar2.b);
                }
            }
        }
        this.a.addAll(list);
        this.b.c(arrayList);
        dg7 dg7Var = this.l;
        if (dg7Var == null) {
            return;
        }
        dg7Var.run(H());
    }

    public final HashSet H() {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            re7 re7Var = (re7) obj;
            int[][] iArr = lg7.a;
            String strH = rf7.h(re7Var);
            kg7 kg7VarG = lg7.g(c5o.m().o(re7Var.f(), strH));
            if (kg7VarG == kg7.m) {
                kg7VarG = kg7.l;
            }
            hashSet.add(kg7VarG);
        }
        return hashSet;
    }

    public final re7 I(long j) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            re7 re7Var = (re7) obj;
            if (re7Var.o == j) {
                return re7Var;
            }
        }
        return null;
    }

    public final void J(List list, vvj vvjVar) {
        bp bpVar = this.d;
        bpVar.a = 0;
        this.b.g((xe7) bpVar.b);
        bp bpVar2 = this.e;
        bpVar2.a = 0;
        this.b.g((xe7) bpVar2.b);
        this.a.clear();
        this.b.d();
        this.b = new xvj(xe7.class, new ye7(this, vvjVar));
        this.j = vvjVar;
        G(list);
    }

    public final void K() {
        if (this.i != null) {
            for (int i = 0; i < this.i.getChildCount(); i++) {
                RecyclerView recyclerView = this.i;
                i iVarT = recyclerView.T(recyclerView.getChildAt(i));
                if (iVarT != null && iVarT.getItemViewType() == 0) {
                    notifyItemChanged(iVarT.getAdapterPosition());
                }
            }
        }
    }

    @Override // defpackage.kkm
    public final e5d N(List list) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            re7 re7Var = (re7) it.next();
            if (this.a.remove(re7Var)) {
                long j = re7Var.o;
                int i = 0;
                while (true) {
                    xvj xvjVar = this.b;
                    if (i >= xvjVar.h) {
                        i = -1;
                        break;
                    }
                    if (((xe7) xvjVar.f(i)).a == j) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    xe7 xe7Var = (xe7) this.b.f(i);
                    xvj xvjVar2 = this.b;
                    xvjVar2.i();
                    xvjVar2.f(i);
                    xvjVar2.h(i, true);
                    boolean z = xe7Var.c;
                    bp bpVar = this.d;
                    bp bpVar2 = this.e;
                    bp bpVar3 = z ? bpVar2 : bpVar;
                    int i2 = bpVar3.a - 1;
                    bpVar3.a = i2;
                    if (i2 == 0) {
                        this.b.g((xe7) bpVar3.b);
                        if (bpVar3 == bpVar) {
                            this.b.g((xe7) bpVar2.b);
                        }
                    }
                }
            }
            arrayList.add(new guh(re7Var, 0));
        }
        dg7 dg7Var = this.l;
        if (dg7Var != null) {
            dg7Var.run(H());
        }
        return new e5d(arrayList, Collections.EMPTY_LIST, (byte) 2);
    }

    @Override // defpackage.kkm
    public final void O(l46 l46Var) {
    }

    public final int getItemCount() {
        return this.b.h;
    }

    public final long getItemId(int i) {
        return ((xe7) this.b.f(i)).a;
    }

    public final int getItemViewType(int i) {
        return ((xe7) this.b.f(i)).b ? 1 : 0;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.i = recyclerView;
        recyclerView.m(new qic(recyclerView.getContext()));
    }

    public final void onBindViewHolder(i iVar, int i) throws Resources.NotFoundException {
        xe7 xe7Var = (xe7) this.b.f(i);
        if (xe7Var.b) {
            long j = xe7Var.a;
            if (j == -1) {
                a9a a9aVar = (a9a) iVar;
                vg7 vg7Var = this.n;
                a9aVar.b.setText(2132018710);
                a9aVar.U(vg7Var);
                this.m = new WeakReference(a9aVar);
                return;
            }
            if (j == -2) {
                a9a a9aVar2 = (a9a) iVar;
                a9aVar2.b.setText(2132018709);
                a9aVar2.U(null);
                return;
            }
            return;
        }
        qg7 qg7Var = (qg7) iVar;
        re7 re7Var = xe7Var.d;
        TextView textView = qg7Var.g;
        View view = qg7Var.h;
        AppCompatImageView appCompatImageView = qg7Var.k;
        qg7Var.p = re7Var;
        pg7 pg7Var = qg7Var.q;
        if (pg7Var != null) {
            pg7Var.a();
        }
        re7Var.u.b(qg7Var.t);
        ((i) qg7Var).itemView.setTag(re7Var);
        appCompatImageView.setTag(re7Var);
        view.setTag(re7Var);
        String strF = re7Var.f();
        String[] strArr = aik.a;
        textView.setText(ehi.a(strF));
        int iA = vep.A(re7Var.f);
        appCompatImageView.setImageResource(iA != 0 ? iA != 1 ? iA != 2 ? 0 : 2131232212 : 2131232067 : 2131232175);
        int iA2 = vep.A(re7Var.f);
        n1h.n(appCompatImageView, iA2 != 0 ? iA2 != 1 ? iA2 != 2 ? 0 : 2132021985 : 2132018651 : 2132018633, 0);
        z zVar = qg7Var.l;
        zVar.b = re7Var.f;
        zVar.s();
        qg7Var.m0(re7Var);
        view.setContentDescription(((i) qg7Var).itemView.getContext().getString(2132021926, textView.getText()));
        qg7Var.U();
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == 1 ? new a9a(j7c.n(viewGroup, 2131558960, viewGroup, false)) : new qg7(j7c.n(viewGroup, 2131558674, viewGroup, false), this.c, this.f, this.h);
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.i = null;
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public final void onViewRecycled(i iVar) {
        if (iVar instanceof qg7) {
            ((qg7) iVar).e0();
        }
    }

    @Override // defpackage.kkm
    public final void t(e5d e5dVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Iterator it = e5dVar.iterator();
        while (it.hasNext()) {
            G(Collections.singletonList((re7) ((guh) it.next()).a));
        }
    }
}
