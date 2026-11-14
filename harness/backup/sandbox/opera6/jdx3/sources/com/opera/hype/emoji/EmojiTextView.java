package com.opera.hype.emoji;

import android.R;
import android.content.Context;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.widget.TextView;
import defpackage.eq6;
import defpackage.exj;
import defpackage.fz7;
import defpackage.oz7;
import defpackage.pwj;
import defpackage.vg4;
import defpackage.y4h;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/opera/hype/emoji/EmojiTextView;", "Lyq1;", "emoji"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public class EmojiTextView extends yq1 {
    public static final /* synthetic */ int i = 0;
    public final zyk h;

    public EmojiTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmojiTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        bpd bpdVar = ((yq1) this).c;
        if (bpdVar == null) {
            bpdVar = new bpd(this);
            ((yq1) this).c = bpdVar;
        }
        ((gyg) ((eq6) bpdVar.c).a).T(false);
        this.h = z4c.b(new vg4(context, (byte) 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.widget.TextView, com.opera.hype.emoji.EmojiTextView] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.text.Spannable, android.text.Spanned, java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence == 0 || charSequence.length() == 0) {
            super/*android.widget.TextView*/.setText(charSequence, bufferType);
            return;
        }
        fz7 fz7Var = (fz7) this.h.getValue();
        fz7Var.getClass();
        if (!(charSequence instanceof PrecomputedText) && !(charSequence instanceof apg)) {
            charSequence = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
            y4h.n(charSequence, uqh.a(bz7.class));
            k1j k1jVarA = t1j.a(new d((byte) 1, (mt5) null, (Object) charSequence));
            int i2 = -1;
            int i3 = -1;
            while (k1jVarA.hasNext()) {
                int iIntValue = ((Number) k1jVarA.next()).intValue();
                if (i2 == iIntValue) {
                    i2++;
                } else {
                    if (i3 < i2) {
                        charSequence.setSpan(new bz7(), i3, i2, 33);
                    }
                    i2 = iIntValue + 1;
                    i3 = iIntValue;
                }
            }
            if (i3 < i2) {
                charSequence.setSpan(new bz7(), i3, i2, 33);
            }
            Context context = fz7Var.a;
            CountDownLatch countDownLatch = oz7.a;
            vh9 vh9VarV = cs5.v(context);
            if (vh9VarV == null) {
                vh9VarV = new vh9(context, new th9("Noto Color Emoji Compat", 2130903048));
            }
            ((tx7) vh9VarV).b = false;
            if (oz7.a(context, vh9VarV) && xx7.a().c() == 1) {
                y4h.n(charSequence, uqh.a(ay7.class));
                xx7.a().k((CharSequence) charSequence);
                k1j k1jVarA2 = t1j.a(new exj(charSequence, charSequence.length(), uqh.a(lam.class), null));
                while (k1jVarA2.hasNext()) {
                    pwj pwjVar = (pwj) k1jVarA2.next();
                    ay7 ay7Var = new ay7((cz7) pwjVar.a);
                    Object obj = pwjVar.a;
                    if (ay7Var != obj) {
                        charSequence.removeSpan(obj);
                        charSequence.setSpan(ay7Var, pwjVar.b, pwjVar.c, pwjVar.d);
                    }
                }
            }
        }
        super/*android.widget.TextView*/.setText(charSequence, TextView.BufferType.SPANNABLE);
    }
}
