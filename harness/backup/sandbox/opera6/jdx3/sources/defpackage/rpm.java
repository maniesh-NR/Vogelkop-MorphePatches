package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.opera.android.widget.UrlFieldEditText;

/* loaded from: classes.dex */
public final class rpm implements r8n {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ rpm(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, android.widget.TextView, com.opera.android.widget.UrlFieldEditText] */
    @Override // defpackage.r8n
    public final void a(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ?? r3 = (UrlFieldEditText) obj;
                int i = UrlFieldEditText.i0;
                r3.B.a = r3.getHintTextColors();
                r3.C.a = r3.getTextColors();
                r3.invalidate();
                break;
            default:
                Context context = view.getContext();
                AttributeSet attributeSet = (AttributeSet) ((zg) obj).c;
                int color = sgb.s(context, attributeSet).getColor();
                if (view instanceof ScrollView) {
                    ((ScrollView) view).setEdgeEffectColor(color);
                } else if (view instanceof AbsListView) {
                    ((AbsListView) view).setEdgeEffectColor(color);
                }
                if (!(view instanceof NestedScrollView)) {
                    if (view instanceof RecyclerView) {
                        mzg.j((RecyclerView) view, "invalidateGlows", (Class[]) null, new Object[0]);
                        break;
                    }
                } else {
                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                    Context context2 = nestedScrollView.getContext();
                    mzg.p(nestedScrollView, sgb.s(context2, attributeSet), "mEdgeGlowTop");
                    mzg.p(nestedScrollView, sgb.s(context2, attributeSet), "mEdgeGlowBottom");
                    break;
                }
                break;
        }
    }
}
