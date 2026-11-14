package ads_mobile_sdk;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class t61 extends RelativeLayout {
    public static final float[] b = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    public final AnimationDrawable a;

    public t61(Context context, rd1 rd1Var, RelativeLayout.LayoutParams layoutParams) {
        AnimationDrawable animationDrawable;
        super(context);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(b, null, null));
        shapeDrawable.getPaint().setColor(rd1Var.c);
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        String str = rd1Var.a;
        if (!TextUtils.isEmpty(str)) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(str);
            textView.setTextColor(rd1Var.d);
            textView.setTextSize(rd1Var.e);
            textView.setPadding((int) TypedValue.applyDimension(1, 4.0f, ioh.g(context)), 0, (int) TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List list = rd1Var.b;
        if (list.size() > 1) {
            this.a = new AnimationDrawable();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    Drawable drawable = ((zf1) it.next()).a;
                    if (drawable != null && (animationDrawable = this.a) != null) {
                        animationDrawable.addFrame(drawable, (int) pn7.f(rd1Var.f));
                    }
                } catch (Exception e) {
                    vr3 vr3Var = xu0.a;
                    xu0.b("Error while getting drawable. " + e, null);
                }
            }
            imageView.setBackground(this.a);
        } else if (list.size() == 1) {
            try {
                imageView.setImageDrawable(((zf1) list.get(0)).a);
            } catch (Exception e2) {
                vr3 vr3Var2 = xu0.a;
                xu0.b("Error while getting drawable. " + e2, null);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.a;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
