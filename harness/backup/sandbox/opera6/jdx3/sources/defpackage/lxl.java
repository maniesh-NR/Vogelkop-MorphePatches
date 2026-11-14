package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.opera.hype.image.editor.EditImage;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class lxl implements View.OnTouchListener {
    public final qq6 a;
    public final EditImage b;
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final PointF e = new PointF();
    public final RectF f = new RectF();
    public boolean g;

    public lxl(qq6 qq6Var, EditImage editImage) {
        this.a = qq6Var;
        this.b = editImage;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxl.a(android.view.MotionEvent):void");
    }

    public final void b() {
        boolean z = this.g;
        this.g = false;
        this.c.reset();
        this.e.set(0.0f, 0.0f);
        this.f.setEmpty();
        this.d.clear();
        if (z) {
            this.b.l.a(false);
        }
    }

    public final void c(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        PointF pointF = this.e;
        float fMin = Math.min(pointF.x, x);
        RectF rectF = this.f;
        rectF.left = fMin;
        rectF.right = Math.max(pointF.x, x);
        rectF.top = Math.min(pointF.y, y);
        rectF.bottom = Math.max(pointF.y, y);
        int historySize = motionEvent.getHistorySize();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            Path path = this.c;
            if (i >= historySize) {
                path.lineTo(x, y);
                arrayList.add(new PointF(x, y));
                this.b.invalidate((int) (rectF.left - 0.0f), (int) (rectF.top - 0.0f), (int) (rectF.right + 0.0f), (int) (rectF.bottom + 0.0f));
                pointF.set(x, y);
                return;
            }
            float historicalX = motionEvent.getHistoricalX(i);
            float historicalY = motionEvent.getHistoricalY(i);
            if (historicalX < rectF.left) {
                rectF.left = historicalX;
            } else if (historicalX > rectF.right) {
                rectF.right = historicalX;
            }
            if (historicalY < rectF.top) {
                rectF.top = historicalY;
            } else if (historicalY > rectF.bottom) {
                rectF.bottom = historicalY;
            }
            path.lineTo(historicalX, historicalY);
            arrayList.add(new PointF(historicalX, historicalY));
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            int r10 = r11.getPointerCount()
            java.util.ArrayList r0 = r9.d
            r1 = 0
            r2 = 1
            if (r10 > r2) goto Lb6
            int r10 = r11.getAction()
            if (r10 == 0) goto L2a
            if (r10 == r2) goto L22
            r0 = 2
            if (r10 == r0) goto L1a
            r0 = 3
            if (r10 == r0) goto L22
            goto Lba
        L1a:
            boolean r10 = r9.g
            if (r10 == 0) goto Lba
            r9.c(r11)
            return r2
        L22:
            boolean r10 = r9.g
            if (r10 == 0) goto Lba
            r9.a(r11)
            return r2
        L2a:
            qq6 r10 = r9.a
            java.lang.Object r10 = r10.b
            r4 = r10
            com.opera.hype.image.editor.EditImage r4 = (com.opera.hype.image.editor.EditImage) r4
            float r6 = r11.getX()
            float r8 = r11.getY()
            xtb[] r10 = com.opera.hype.image.editor.EditImage.s
            lqh r5 = new lqh
            r5.<init>()
            lqh r7 = new lqh
            r7.<init>()
            bpd r10 = r4.g
            xs7 r3 = new xs7
            r3.<init>()
            boolean r10 = r10.c0(r3)
            if (r10 == 0) goto Lb5
            boolean r10 = r5.a
            if (r10 == 0) goto Lb5
            boolean r10 = r7.a
            if (r10 == 0) goto Lb5
            r9.g = r2
            float r10 = r11.getX()
            float r11 = r11.getY()
            android.graphics.Path r3 = r9.c
            r3.moveTo(r10, r11)
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r10, r11)
            r0.add(r3)
            android.graphics.PointF r0 = r9.e
            r0.set(r10, r11)
            com.opera.hype.image.editor.EditImage r9 = r9.b
            at7 r10 = r9.i
            at7 r11 = defpackage.at7.e
            if (r10 != r11) goto Lb0
            dya r10 = r9.d
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = r10.d
            int r0 = r10.size()
            r3 = r1
        L8c:
            if (r3 >= r0) goto L9c
            java.lang.Object r4 = r10.get(r3)
            int r3 = r3 + 1
            boolean r5 = r4 instanceof defpackage.f76
            if (r5 == 0) goto L8c
            r11.add(r4)
            goto L8c
        L9c:
            int r10 = r11.size()
        La0:
            if (r1 >= r10) goto Lb0
            java.lang.Object r0 = r11.get(r1)
            int r1 = r1 + 1
            f76 r0 = (defpackage.f76) r0
            dya r3 = r9.d
            r3.c(r0)
            goto La0
        Lb0:
            rdb r9 = r9.l
            r9.a(r2)
        Lb5:
            return r2
        Lb6:
            boolean r10 = r9.g
            if (r10 != 0) goto Lbb
        Lba:
            return r1
        Lbb:
            int r10 = r0.size()
            r0 = 10
            if (r10 >= r0) goto Lc7
            r9.b()
            return r1
        Lc7:
            r9.a(r11)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lxl.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
