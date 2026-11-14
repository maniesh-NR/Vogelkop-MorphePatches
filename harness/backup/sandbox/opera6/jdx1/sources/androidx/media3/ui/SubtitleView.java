package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import defpackage.e0c;
import defpackage.hn9;
import defpackage.snk;
import defpackage.vh4;
import defpackage.w36;
import defpackage.x36;
import defpackage.xh4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public List a;
    public xh4 b;
    public float c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final vh4 g;

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.EMPTY_LIST;
        this.b = xh4.g;
        this.c = 0.0533f;
        this.d = 0.08f;
        this.e = true;
        this.f = true;
        vh4 vh4Var = new vh4(context);
        this.g = vh4Var;
        addView(vh4Var);
    }

    public final void a() {
        List list;
        boolean z = this.f;
        boolean z2 = this.e;
        if (z2 && z) {
            list = this.a;
        } else {
            ArrayList arrayList = new ArrayList(this.a.size());
            for (int i = 0; i < this.a.size(); i++) {
                w36 w36VarA = ((x36) this.a.get(i)).a();
                if (!z2) {
                    w36VarA.n = false;
                    CharSequence charSequence = w36VarA.a;
                    if (charSequence instanceof Spanned) {
                        if (!(charSequence instanceof Spannable)) {
                            w36VarA.a = SpannableString.valueOf(charSequence);
                            w36VarA.b = null;
                        }
                        CharSequence charSequence2 = w36VarA.a;
                        charSequence2.getClass();
                        Spannable spannable = (Spannable) charSequence2;
                        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                            if (!(obj instanceof e0c)) {
                                spannable.removeSpan(obj);
                            }
                        }
                    }
                    hn9.t(w36VarA);
                } else if (!z) {
                    hn9.t(w36VarA);
                }
                arrayList.add(w36VarA.a());
            }
            list = arrayList;
        }
        xh4 xh4Var = this.b;
        float f = this.c;
        vh4 vh4Var = this.g;
        ArrayList arrayList2 = vh4Var.a;
        vh4Var.b = list;
        vh4Var.d = xh4Var;
        vh4Var.c = f;
        vh4Var.e = this.d;
        while (arrayList2.size() < list.size()) {
            arrayList2.add(new snk(vh4Var.getContext()));
        }
        vh4Var.invalidate();
    }
}
