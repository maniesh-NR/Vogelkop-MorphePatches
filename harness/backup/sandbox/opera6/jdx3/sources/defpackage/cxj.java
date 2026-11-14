package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class cxj implements Appendable, CharSequence {
    public final ArrayDeque b = new ArrayDeque(8);
    public final StringBuilder a = new StringBuilder((CharSequence) "");

    public cxj() {
        b(0, "");
    }

    public static void d(cxj cxjVar, Object obj, int i, int i2) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                cxjVar.setSpan(obj, i, i2, 33);
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                d(cxjVar, obj2, i, i2);
            }
        }
    }

    public final void a(char c) {
        this.a.append(c);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.a.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        StringBuilder sb = this.a;
        b(sb.length(), charSequence);
        sb.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        StringBuilder sb = this.a;
        b(sb.length(), charSequenceSubSequence);
        sb.append(charSequenceSubSequence);
        return this;
    }

    public final void b(int i, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof axj;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                if (!z) {
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj = spans[i2];
                        setSpan(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj));
                    }
                    return;
                }
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    Object obj2 = spans[i3];
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spanned;
                    setSpan(obj2, spannableStringBuilder.getSpanStart(obj2) + i, spannableStringBuilder.getSpanEnd(obj2) + i, spannableStringBuilder.getSpanFlags(obj2));
                }
            }
        }
    }

    public final List c(int i, int i2) {
        int i3;
        int length = this.a.length();
        if (i2 <= i || i < 0 || i2 > length) {
            return Collections.EMPTY_LIST;
        }
        ArrayDeque arrayDeque = this.b;
        if (i == 0 && length == i2) {
            ArrayList arrayList = new ArrayList(arrayDeque);
            Collections.reverse(arrayList);
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(0);
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            zwj zwjVar = (zwj) itDescendingIterator.next();
            int i4 = zwjVar.b;
            if ((i4 >= i && i4 < i2) || (((i3 = zwjVar.c) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                arrayList2.add(zwjVar);
            }
        }
        return Collections.unmodifiableList(arrayList2);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length();
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        this.b.push(new zwj(i, i2, i3, obj));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        List<zwj> listC = c(i, i2);
        boolean zIsEmpty = listC.isEmpty();
        StringBuilder sb = this.a;
        if (zIsEmpty) {
            return sb.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.subSequence(i, i2));
        int length = spannableStringBuilder.length();
        for (zwj zwjVar : listC) {
            int iMax = Math.max(0, zwjVar.b - i);
            spannableStringBuilder.setSpan(zwjVar.a, iMax, Math.min(length, (zwjVar.c - zwjVar.b) + iMax), zwjVar.d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.a.toString();
    }
}
