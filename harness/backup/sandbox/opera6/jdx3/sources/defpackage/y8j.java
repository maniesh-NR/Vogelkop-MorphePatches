package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.i;
import com.google.android.material.button.MaterialButton;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.widget.MenuSettingsListItem;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class y8j extends d {
    public final jk7 a = new jk7(this);
    public final /* synthetic */ c9j b;

    public y8j(c9j c9jVar) {
        this.b = c9jVar;
        setHasStableIds(true);
    }

    public final int getItemCount() {
        jk7 jk7Var = this.a;
        return ((List) jk7Var.c).size() + (jk7Var.a ? 1 : 0);
    }

    public final long getItemId(int i) {
        jk7 jk7Var = this.a;
        if (((l6j) CollectionsKt.M(i - (jk7Var.a ? 1 : 0), (List) jk7Var.c)) != null) {
            return r1.a;
        }
        return -1L;
    }

    public final int getItemViewType(int i) {
        return (i == 0 && this.a.a) ? 1 : 0;
    }

    public final void onBindViewHolder(i iVar, int i) {
        b9j b9jVar = (b9j) iVar;
        if (b9jVar instanceof z8j) {
            jk7 jk7Var = this.a;
            ((z8j) b9jVar).U((l6j) ((List) jk7Var.c).get(i - (jk7Var.a ? 1 : 0)));
        }
    }

    public final i onCreateViewHolder(ViewGroup viewGroup, int i) {
        c9j c9jVar = this.b;
        if (i == 1) {
            xtb[] xtbVarArr = c9j.w;
            o9j o9jVar = (o9j) c9jVar.r.getValue();
            View viewN = j7c.n(viewGroup, 2131559308, viewGroup, false);
            int i2 = 2131362335;
            MaterialButton materialButtonJ = w1h.j(2131362335, viewN);
            if (materialButtonJ != null) {
                i2 = 2131363099;
                if (((StylingTextView) w1h.j(2131363099, viewN)) != null) {
                    a9j a9jVar = new a9j(new f9j((LinearLayout) viewN, materialButtonJ));
                    ((f9j) a9jVar.b).b.setOnClickListener(new h4i((Object) o9jVar, (byte) 7));
                    return a9jVar;
                }
            }
            t3p.q("Missing required view with ID: ".concat(viewN.getResources().getResourceName(i2)));
            return null;
        }
        tji tjiVar = new tji((Object) c9jVar, (byte) 13);
        MenuSettingsListItem menuSettingsListItemN = j7c.n(viewGroup, 2131559307, viewGroup, false);
        if (menuSettingsListItemN == null) {
            t3p.q("rootView");
            return null;
        }
        z8j z8jVar = new z8j(new e9j(menuSettingsListItemN));
        MenuSettingsListItem menuSettingsListItem = ((e9j) z8jVar.b).a;
        z8jVar.d = ColorStateList.valueOf(f03.C(menuSettingsListItem.getContext()));
        menuSettingsListItem.setOnClickListener(new j5g(z8jVar, tjiVar, (byte) 11));
        kkf kkfVar = new kkf(z8jVar, (byte) 18);
        dll dllVarS = q9n.s(menuSettingsListItem);
        if (dllVarS == null) {
            return z8jVar;
        }
        u8n.b(dllVarS, menuSettingsListItem, kkfVar);
        return z8jVar;
    }

    public final void onViewRecycled(i iVar) {
        b9j b9jVar = (b9j) iVar;
        super.onViewRecycled(b9jVar);
        if (b9jVar instanceof z8j) {
            ((z8j) b9jVar).c = null;
        }
    }
}
