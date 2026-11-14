package ads_mobile_sdk;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.prb;
import defpackage.tpi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class zv1 {
    public final Context a;
    public final qr0 b;
    public final ah3 c;

    public zv1(Context context, qr0 qr0Var, ah3 ah3Var) {
        this.a = context;
        this.b = qr0Var;
        this.c = ah3Var;
    }

    public static yv1 a(int i) {
        return i != -2 ? i != -1 ? yv1.a : yv1.b : yv1.c;
    }

    public static prb a(Context context, Rect rect) {
        prb prbVar = new prb();
        prbVar.p(Integer.valueOf(zed.b((rect.right - rect.left) / context.getResources().getDisplayMetrics().density)), "width");
        prbVar.p(Integer.valueOf(zed.b((rect.bottom - rect.top) / context.getResources().getDisplayMetrics().density)), "height");
        prbVar.p(Integer.valueOf(zed.b(rect.left / context.getResources().getDisplayMetrics().density)), "x");
        prbVar.p(Integer.valueOf(zed.b(rect.top / context.getResources().getDisplayMetrics().density)), "y");
        prbVar.r("relative_to", "self");
        return prbVar;
    }

    public final prb a() {
        prb prbVar = new prb();
        Context context = this.a;
        prbVar.p(Integer.valueOf(zed.b(context.getResources().getDisplayMetrics().widthPixels / context.getResources().getDisplayMetrics().density)), "width");
        prbVar.p(Integer.valueOf(zed.b(context.getResources().getDisplayMetrics().heightPixels / context.getResources().getDisplayMetrics().density)), "height");
        return prbVar;
    }

    public final prb a(FrameLayout frameLayout) {
        Window window;
        if (frameLayout == null) {
            return new prb();
        }
        prb prbVar = new prb();
        View rootView = frameLayout.getRootView();
        Context context = rootView != null ? rootView.getContext() : null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        WindowManager.LayoutParams attributes = (activity == null || (window = activity.getWindow()) == null) ? null : window.getAttributes();
        prbVar.q("can_show_on_lock_screen", Boolean.valueOf((attributes == null || (attributes.flags & 524288) == 0) ? false : true));
        KeyguardManager keyguardManager = (KeyguardManager) this.a.getSystemService(KeyguardManager.class);
        prbVar.q("is_keyguard_locked", keyguardManager != null ? Boolean.valueOf(keyguardManager.isKeyguardLocked()) : null);
        return prbVar;
    }

    public final prb a(FrameLayout frameLayout, ImageView.ScaleType scaleType, Map map) {
        ViewGroup.LayoutParams layoutParams;
        fo foVar = fo.a;
        boolean z = false;
        if (frameLayout == null) {
            return new prb();
        }
        prb prbVar = new prb();
        int i = 2;
        int[] iArr = new int[2];
        frameLayout.getLocationOnScreen(iArr);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            View view = (View) ((WeakReference) entry.getValue()).get();
            if (view != null) {
                int[] iArr2 = new int[i];
                view.getLocationOnScreen(iArr2);
                prb prbVar2 = new prb();
                prb prbVar3 = new prb();
                int measuredWidth = view.getMeasuredWidth();
                Context context = this.a;
                prbVar3.p(Integer.valueOf(ioh.l(context, measuredWidth)), "width");
                boolean z2 = z;
                prbVar3.p(Integer.valueOf(ioh.l(context, view.getMeasuredHeight())), "height");
                prbVar3.p(Integer.valueOf(ioh.l(context, iArr2[z2 ? 1 : 0] - iArr[z2 ? 1 : 0])), "x");
                Iterator it2 = it;
                prbVar3.p(Integer.valueOf(ioh.l(context, iArr2[1] - iArr[1])), "y");
                int[] iArr3 = iArr;
                prbVar3.r("relative_to", "ad_view");
                prbVar2.o("frame", prbVar3);
                prb prbVar4 = new prb();
                Rect rect = new Rect();
                if (view.getLocalVisibleRect(rect)) {
                    prbVar4 = a(context, rect);
                } else {
                    prbVar4.p(0, "width");
                    prbVar4.p(0, "height");
                    prbVar4.p(Integer.valueOf(ioh.l(context, iArr2[z2 ? 1 : 0] - iArr3[z2 ? 1 : 0])), "x");
                    prbVar4.p(Integer.valueOf(ioh.l(context, iArr2[1] - iArr3[1])), "y");
                    prbVar4.r("relative_to", "ad_view");
                }
                prbVar2.o("visible_bounds", prbVar4);
                boolean zA = Intrinsics.a(str, "3010");
                qr0 qr0Var = this.b;
                if (zA) {
                    prbVar2.r("mediaview_graphics_matrix", view.getMatrix().toShortString());
                    Boolean bool = Boolean.FALSE;
                    if (((Boolean) qr0Var.a("gads:nas_collect_layout_params:enabled", bool, foVar)).booleanValue() && (layoutParams = view.getLayoutParams()) != null) {
                        prbVar2.p(Integer.valueOf(a(layoutParams.width).ordinal()), "view_width_layout_type");
                        prbVar2.p(Integer.valueOf(a(layoutParams.height).ordinal()), "view_height_layout_type");
                    }
                    if (((Boolean) qr0Var.a("gads:nas_collect_view_path:enabled", bool, foVar)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(view.getId()));
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            arrayList.add(Integer.valueOf(((View) parent).getId()));
                        }
                        prbVar2.r("view_path", CollectionsKt.P(arrayList, "/", (CharSequence) null, (String) null, 0, (Function1) null, 62));
                    }
                    prbVar2.p(Integer.valueOf(scaleType.ordinal()), "mediaview_scale_type");
                }
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    prbVar2.p(Integer.valueOf(textView.getCurrentTextColor()), "text_color");
                    prbVar2.p(Float.valueOf(textView.getTextSize()), "font_size");
                    prbVar2.r("text", textView.getText().toString());
                }
                prbVar2.q("is_clickable", Boolean.valueOf(view.isClickable()));
                if (((Boolean) qr0Var.a("gads:nas_collect_alpha:enabled", Boolean.TRUE, foVar)).booleanValue()) {
                    prbVar2.p(Float.valueOf(view.getAlpha()), "alpha");
                }
                prbVar.o(str, prbVar2);
                it = it2;
                z = z2 ? 1 : 0;
                iArr = iArr3;
                i = 2;
            }
        }
        return prbVar;
    }

    public final prb a(String str, Point point, Point point2) {
        prb prbVar = new prb();
        int i = point2.x;
        Context context = this.a;
        prbVar.p(Integer.valueOf(ioh.l(context, i)), "x");
        prbVar.p(Integer.valueOf(ioh.l(context, point2.y)), "y");
        prbVar.p(Integer.valueOf(ioh.l(context, point.x)), "start_x");
        prbVar.p(Integer.valueOf(ioh.l(context, point.y)), "start_y");
        prb prbVar2 = new prb();
        prbVar2.o("click_point", prbVar);
        prbVar2.r("asset_id", str);
        return prbVar2;
    }

    public final prb b(FrameLayout frameLayout) {
        qr0 qr0Var;
        xv1 xv1Var;
        fo foVar = fo.a;
        if (frameLayout == null) {
            return new prb();
        }
        ViewParent parent = frameLayout.getParent();
        loop0: while (true) {
            qr0Var = this.b;
            if (parent == null) {
                xv1Var = xv1.SCROLL_VIEW_TYPE_NONE;
                break;
            }
            if (parent instanceof ScrollView) {
                xv1Var = xv1.SCROLL_VIEW_TYPE_SCROLL_VIEW;
                break;
            }
            if (parent instanceof AbsListView) {
                xv1Var = xv1.SCROLL_VIEW_TYPE_ABS_LIST_VIEW;
                break;
            }
            if (parent instanceof HorizontalScrollView) {
                xv1Var = xv1.SCROLL_VIEW_TYPE_HORIZONTAL_SCROLL_VIEW;
                break;
            }
            if (parent instanceof tpi) {
                xv1Var = xv1.SCROLL_VIEW_TYPE_SCROLLING_VIEW;
                break;
            }
            qr0Var.getClass();
            if (((Boolean) qr0Var.a("gads:native:enable_scroll_view_type_by_keyword", Boolean.FALSE, foVar)).booleanValue()) {
                Iterator it = ((List) qr0Var.a("gads:native:scrollable_container_keywords", Arrays.asList("recycler", "viewflipper"), fo.a$15)).iterator();
                while (it.hasNext()) {
                    if (StringsKt.E(parent.getClass().getName().toLowerCase(Locale.ROOT), (String) it.next(), false)) {
                        xv1Var = xv1.SCROLL_VIEW_TYPE_BY_KEYWORD;
                        break loop0;
                    }
                }
            }
            parent = parent.getParent();
        }
        prb prbVar = new prb();
        qr0Var.getClass();
        Boolean bool = Boolean.TRUE;
        if (((Boolean) qr0Var.a("gads:native:enable_contained_in_scroll_view_signal", bool, foVar)).booleanValue()) {
            prbVar.q("contained_in_scroll_view", Boolean.valueOf(xv1Var != xv1.SCROLL_VIEW_TYPE_NONE));
        }
        if (((Boolean) qr0Var.a("gads:native:enable_scroll_view_type_signal", bool, foVar)).booleanValue()) {
            prbVar.p(Integer.valueOf(xv1Var.a), "scroll_view_type");
        }
        return prbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.prb c(android.widget.FrameLayout r19) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zv1.c(android.widget.FrameLayout):prb");
    }
}
