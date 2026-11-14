package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.opera.android.bubbleview.BubbleView;
import com.opera.android.custom_views.StylingTextView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class exd extends lz3 {
    public final /* synthetic */ byte f = 0;

    public /* synthetic */ exd(ViewGroup viewGroup, int i, long j, hxj hxjVar) {
        super(viewGroup, i, j, hxjVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.view.View, android.widget.TextView, com.opera.android.custom_views.StylingTextView] */
    public exd(ViewGroup viewGroup, hxj hxjVar, ftd ftdVar, List list) {
        super(viewGroup, 2131559053, 0L, hxjVar);
        this.b.setOnClickListener(new sma(this, (byte) 29));
        this.b.setFocusable(false);
        BubbleView bubbleView = this.b;
        float fL = ftdVar.a.l(bubbleView.getContext());
        int i = ftdVar.b;
        bubbleView.m = fL;
        bubbleView.A = i;
        bubbleView.b();
        ViewGroup viewGroup2 = (ViewGroup) this.b.findViewById(2131362414);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gtd gtdVar = (gtd) it.next();
            View viewInflate = p37.U(viewGroup2).inflate(2131559054, viewGroup2, false);
            viewGroup2.addView(viewInflate);
            if (viewInflate == 0) {
                t3p.q("rootView");
                throw null;
            }
            ?? r11 = (StylingTextView) viewInflate;
            r11.setText(gtdVar.a.a(r11.getResources()));
            lxh lxhVar = gtdVar.b;
            r11.s(lxhVar != null ? lxhVar.f(r11.getContext()) : null, null);
            r11.setOnClickListener(new jf7(gtdVar, this, (byte) 21));
        }
    }

    public /* synthetic */ exd(ViewGroup viewGroup, l11 l11Var, List list) {
        this(viewGroup, l11Var, ftd.NORMAL, list);
    }

    public static CharSequence g(TextView textView, String str, String str2) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new dxd(textView.getContext(), str2), 0, str.length(), 17);
        return spannableStringBuilder;
    }

    @Override // defpackage.lz3
    public final void c(boolean z) {
        switch (this.f) {
            case 1:
                super.c(z);
                b(hjm.b);
                break;
            default:
                super.c(z);
                break;
        }
    }
}
