package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.opera.android.custom_views.CheckBox;

/* loaded from: classes.dex */
public final class zu4 extends ol7 {
    public final /* synthetic */ byte b = 1;
    public Object c;

    public /* synthetic */ zu4(Drawable drawable) {
        super(drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu4(CheckBox checkBox, Drawable drawable) {
        super(drawable);
        this.c = checkBox;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.TextView, com.opera.android.custom_views.CheckBox] */
    public final void draw(Canvas canvas) {
        switch (this.b) {
            case 0:
                int iSave = canvas.save();
                ?? r1 = (CheckBox) this.c;
                if (r1.o == 4 && r1.getLineCount() > 1) {
                    canvas.translate(0.0f, (((r1.getLayout().getLineBottom(0) - Math.round(r1.getLineSpacingExtra())) - ((ol7) this).a.getIntrinsicHeight()) / 2) - ((r1.getLayout().getHeight() - ((ol7) this).a.getIntrinsicHeight()) / 2));
                }
                super.draw(canvas);
                canvas.restoreToCount(iSave);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable mutate() {
        switch (this.b) {
            case 0:
                Drawable drawable = ((ol7) this).a;
                if (drawable != null) {
                    drawable.mutate();
                }
                break;
        }
        return super/*android.graphics.drawable.Drawable*/.mutate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBoundsChange(Rect rect) {
        switch (this.b) {
            case 1:
                Rect rect2 = (Rect) this.c;
                if (rect2 == null) {
                    Drawable drawable = ((ol7) this).a;
                    if (drawable != null) {
                        drawable.setBounds(rect);
                        break;
                    }
                } else {
                    this.c = rect2;
                    Drawable drawable2 = ((ol7) this).a;
                    if (drawable2 != null) {
                        drawable2.setBounds(rect2.left, rect2.top, rect2.right, rect2.bottom);
                    }
                    invalidateSelf();
                    break;
                }
                break;
            default:
                super.onBoundsChange(rect);
                break;
        }
    }
}
