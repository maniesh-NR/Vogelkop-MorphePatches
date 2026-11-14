package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.text.CharacterIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* loaded from: classes.dex */
public final class c91 implements vzf {
    public final String a;
    public final ikl b;
    public final List c;
    public final List d;
    public final mh9 e;
    public final n27 f;
    public final ib1 g;
    public final CharSequence h;
    public final w2c i;
    public ghf j;
    public final boolean k;
    public final byte l;
    public final int m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x081b  */
    /* JADX WARN: Type inference failed for: r0v0, types: [c91, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c91(java.lang.String r41, defpackage.ikl r42, java.util.List r43, java.util.List r44, defpackage.mh9 r45, defpackage.n27 r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 2207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c91.<init>(java.lang.String, ikl, java.util.List, java.util.List, mh9, n27, boolean):void");
    }

    public final boolean a() {
        ghf ghfVar = this.j;
        if (ghfVar != null ? ghfVar.E() : false) {
            return true;
        }
        if (!this.k && y9m.M(this.b)) {
            eq6 eq6Var = by7.a;
            eq6 eq6Var2 = by7.a;
            iak iakVarI = (iak) eq6Var2.a;
            if (iakVarI == null) {
                if (xx7.e()) {
                    iakVarI = eq6Var2.I();
                    eq6Var2.a = iakVarI;
                } else {
                    iakVarI = cs5.g;
                }
            }
            if (((Boolean) iakVarI.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final float b() {
        w2c w2cVar = this.i;
        float f = w2cVar.e;
        TextPaint textPaint = w2cVar.b;
        if (!Float.isNaN(f)) {
            return w2cVar.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = w2cVar.a;
        lineInstance.setText((CharacterIterator) new au4(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, ic4.e);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new IntRange(i, next, 1));
            } else {
                IntRange intRange = (IntRange) priorityQueue.peek();
                if (intRange != null && ((a) intRange).b - ((a) intRange).a < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new IntRange(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                t3p.y();
                return 0.0f;
            }
            IntRange intRange2 = (IntRange) it.next();
            desiredWidth = Layout.getDesiredWidth(w2cVar.b(), ((a) intRange2).a, ((a) intRange2).b, textPaint);
            while (it.hasNext()) {
                IntRange intRange3 = (IntRange) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(w2cVar.b(), ((a) intRange3).a, ((a) intRange3).b, textPaint));
            }
        }
        w2cVar.e = desiredWidth;
        return desiredWidth;
    }
}
