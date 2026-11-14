package defpackage;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArrayMap;
import androidx.mediarouter.app.OperaMediaRouteButton;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.slider.Slider;
import com.google.android.material.slider.h;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.custom_views.CardView;
import com.opera.android.custom_views.CheckBox;
import com.opera.android.custom_views.LayoutDirectionActionBarContextView;
import com.opera.android.custom_views.PageDotIndicator;
import com.opera.android.custom_views.RadioButton;
import com.opera.android.custom_views.StylingImageCheckableWithText;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.custom_views.TabCountButton;
import com.opera.android.settings.SettingsStatisticView;
import com.opera.android.theme.ThemeableRecyclerView;
import com.opera.android.ui.catalog.widget.OperaIconedMessage;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.android.ui.catalog.widget.OperaProgressIndicator;
import com.opera.android.widget.GradientSlider;
import com.opera.android.widget.MenuSettingsListItem;
import com.opera.android.widget.ScheduleRangeSlider;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.lang.reflect.Constructor;
import java.util.ArrayDeque;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class tll implements LayoutInflater.Factory2 {
    public static final Class[] e = {Context.class, AttributeSet.class};
    public static final String[] f = {"android.widget.", "android.view.", "android.webkit."};
    public static final ArrayMap g = new ArrayMap(0);
    public static final HashMap h;
    public final Object[] a = new Object[2];
    public final pp1 b;
    public final dll c;
    public final qp2 d;

    static {
        HashMap map = new HashMap();
        h = map;
        map.put(jp1.class, 2130968877);
        map.put(lp1.class, 2130968998);
        map.put(fq1.class, 2130970615);
        map.put(AppCompatImageButton.class, 2130969925);
        map.put(yq1.class, Integer.valueOf(R.attr.textViewStyle));
        map.put(bq1.class, 2130969588);
        map.put(gp1.class, 2130968708);
        map.put(dq1.class, 2130968708);
        map.put(AutoCompleteTextView.class, 2130968708);
        map.put(AppCompatSeekBar.class, 2130970689);
        map.put(CardView.class, 2130968933);
        map.put(SwitchCompat.class, 2130970926);
        map.put(Toolbar.class, 2130971164);
        map.put(TabCountButton.class, 2130968614);
        map.put(CheckBox.class, Integer.valueOf(R.attr.checkboxStyle));
        map.put(RadioButton.class, Integer.valueOf(R.attr.radioButtonStyle));
        map.put(LayoutDirectionActionBarContextView.class, 2130968608);
        map.put(TextInputLayout.class, 2130971090);
        map.put(MaterialButton.class, 2130970247);
        map.put(Chip.class, 2130969035);
        map.put(TabLayout.class, 2130970975);
        map.put(FloatingActionButton.class, 2130969756);
        map.put(Slider.class, 2130970782);
        map.put(GradientSlider.class, 2130970782);
        map.put(h.class, 2130970782);
        map.put(ScheduleRangeSlider.class, 2130970782);
        map.put(AppBarLayout.class, 2130968661);
        map.put(LinearProgressIndicator.class, 2130970159);
        map.put(CircularProgressIndicator.class, 2130969048);
        map.put(OperaMediaRouteButton.class, 2130970321);
    }

    public tll(pp1 pp1Var, dll dllVar, qp2 qp2Var) {
        this.b = pp1Var;
        this.c = dllVar;
        this.d = qp2Var;
    }

    public final View a(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        ArrayMap arrayMap = g;
        Constructor constructor = (Constructor) arrayMap.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2.concat(str) : str).asSubclass(View.class).getConstructor(e);
                constructor.setAccessible(true);
                arrayMap.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        return (View) constructor.newInstance(this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        int iIntValue;
        ff2 ff2VarA;
        byte b;
        View viewM;
        ff2 ff2VarA2;
        ff2 ff2VarA3;
        ff2 ff2VarA4;
        ff2 ff2VarA5;
        ff2 ff2Var;
        String attributeValue = str;
        Context context2 = context;
        ImageView imageViewA = this.b.a(attributeValue, context2, attributeSet);
        ff2 ff2Var2 = null;
        int i = 0;
        if (imageViewA == 0) {
            imageViewA = this.a;
            if (attributeValue.equals("view")) {
                attributeValue = attributeSet.getAttributeValue(null, "class");
            }
            try {
                imageViewA[0] = context2;
                imageViewA[1] = attributeSet;
                if (-1 == attributeValue.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = f;
                        if (i2 >= 3) {
                            imageViewA = 0;
                            break;
                        }
                        View viewA = a(context2, attributeValue, strArr[i2]);
                        if (viewA != null) {
                            imageViewA[0] = 0;
                            imageViewA[1] = 0;
                            imageViewA = viewA;
                            break;
                        }
                        i2++;
                    }
                } else {
                    View viewA2 = a(context2, attributeValue, null);
                    imageViewA[0] = 0;
                    imageViewA[1] = 0;
                    imageViewA = viewA2;
                }
            } catch (Exception unused) {
                imageViewA = 0;
            } finally {
                imageViewA[0] = 0;
                imageViewA[1] = 0;
            }
        }
        if (imageViewA == 0) {
            return null;
        }
        int i3 = tpj.a;
        Context baseContext = context2;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                Class<?> superclass = imageViewA.getClass();
                while (true) {
                    if (superclass == Object.class) {
                        iIntValue = 0;
                        break;
                    }
                    Integer num = (Integer) h.get(superclass);
                    if (num != null) {
                        iIntValue = num.intValue();
                        break;
                    }
                    superclass = superclass.getSuperclass();
                }
                zg zgVar = new zg(imageViewA, attributeSet, iIntValue);
                View view2 = (View) zgVar.b;
                ff2 ff2VarA6 = ff2.a(zgVar, u8n.h);
                if (ff2VarA6 != null && ff2VarA6.c(imageViewA.getContext()) == null) {
                    ff2VarA6 = null;
                }
                if (view != null) {
                    context2 = view.getContext();
                }
                ft5 context3 = imageViewA.getContext();
                ArrayDeque arrayDeque = new ArrayDeque();
                boolean z = true;
                while ((context3 instanceof ContextWrapper) && context3 != context2) {
                    ft5 ft5Var = (ContextWrapper) context3;
                    ft5 baseContext2 = ft5Var.getBaseContext();
                    if (baseContext2.getTheme() != ft5Var.getTheme()) {
                        if (z && ff2VarA6 != null) {
                            ff2Var = null;
                        } else if (ft5Var instanceof ContextThemeWrapper) {
                            ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) ft5Var;
                            Object[] objArr = new Object[i];
                            ff2Var = null;
                            arrayDeque.push(new t8n(contextThemeWrapper, ((Integer) mzg.j(contextThemeWrapper, "getThemeResId", (Class[]) null, objArr)).intValue()));
                        } else {
                            ff2Var = null;
                            if (ft5Var instanceof ft5) {
                                ft5 ft5Var2 = ft5Var;
                                arrayDeque.push(new t8n(ft5Var2, ft5Var2.a));
                            }
                        }
                        z = false;
                    } else {
                        ff2Var = null;
                    }
                    context3 = baseContext2;
                    ff2Var2 = ff2Var;
                    i = 0;
                }
                ff2 ff2Var3 = ff2Var2;
                dll dllVar = this.c;
                if (ff2VarA6 != null || !arrayDeque.isEmpty()) {
                    u8n.f(dllVar, imageViewA, ff2VarA6, arrayDeque);
                }
                if (view2.getId() == 2131363056 && (view2 instanceof ImageView)) {
                    ImageView imageView = imageViewA;
                    imageView.setBackground(f03.x(R.attr.listDivider, imageView.getContext()));
                }
                if (!(imageViewA instanceof StylingTextView)) {
                    xf8.r(zgVar);
                }
                CharSequence contentDescription = imageViewA.getContentDescription();
                if (contentDescription != null && imageViewA.getTooltipText() == null) {
                    TypedArray typedArrayObtainStyledAttributes = imageViewA.getContext().obtainStyledAttributes(attributeSet, khh.S, iIntValue, 0);
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                    typedArrayObtainStyledAttributes.recycle();
                    n1h.o(imageViewA, contentDescription, resourceId);
                }
                boolean z2 = imageViewA instanceof TextView;
                if (z2 || (imageViewA instanceof TabCountButton)) {
                    ff2 ff2VarA7 = ff2.a(zgVar, y8n.r);
                    ff2 ff2VarA8 = ff2.a(zgVar, y8n.s);
                    ff2 ff2VarA9 = ff2.a(zgVar, y8n.t);
                    ff2 ff2VarA10 = ff2.a(zgVar, y8n.u);
                    if (!ff2.b(ff2VarA7) || !ff2.b(ff2VarA8) || !ff2.b(ff2VarA9) || !ff2.b(ff2VarA10)) {
                        u8n.a(dllVar, zgVar, new y8n(ff2VarA7, ff2VarA8, ff2VarA9, ff2VarA10, (byte) 3));
                    }
                }
                if (imageViewA instanceof StylingTextView) {
                    ff2 ff2VarA11 = ff2.a(zgVar, v8n.j);
                    ff2 ff2VarA12 = ff2.a(zgVar, v8n.k);
                    if (!ff2.b(ff2VarA11) || !ff2.b(ff2VarA12)) {
                        u8n.a(dllVar, zgVar, new v8n(ff2VarA11, ff2VarA12, (byte) 3));
                    }
                }
                boolean z3 = imageViewA instanceof AppBarLayout;
                if (!z3 && !(imageViewA instanceof androidx.cardview.widget.CardView) && (view2.getId() != 2131363056 || !(view2 instanceof ImageView))) {
                    ff2 ff2VarA13 = imageViewA instanceof ActionBarContextView ? ff2.a(zgVar, w8n.e) : ff2Var3;
                    if (ff2VarA13 == null) {
                        ff2VarA13 = ff2.a(zgVar, w8n.f);
                    }
                    if (ff2VarA13 != null) {
                        ff2 ff2VarA14 = ff2.a(zgVar, w8n.h);
                        if (ff2VarA14 == null) {
                            ff2VarA14 = ff2.a(zgVar, w8n.g);
                        }
                        ff2 ff2VarA15 = ff2.a(zgVar, w8n.j);
                        if (ff2VarA15 == null) {
                            ff2VarA15 = ff2.a(zgVar, w8n.i);
                        }
                        u8n.a(dllVar, zgVar, new w8n(ff2VarA13, ff2VarA14, ff2VarA15, (byte) 0));
                    }
                }
                ff2 ff2VarA16 = ff2.a(zgVar, v8n.l);
                byte b2 = 4;
                if (ff2VarA16 != null) {
                    u8n.a(dllVar, zgVar, new v8n(ff2VarA16, ff2.a(zgVar, v8n.m), b2));
                }
                ff2 ff2VarA17 = ff2.a(zgVar, x8n.f);
                if (ff2VarA17 != null) {
                    u8n.a(dllVar, zgVar, new x8n(ff2VarA17, (byte) 3));
                }
                ff2 ff2VarA18 = ff2.a(zgVar, x8n.c);
                if (!ff2.b(ff2VarA18)) {
                    u8n.a(dllVar, zgVar, new x8n(ff2VarA18, (byte) 0));
                }
                boolean z4 = imageViewA instanceof CardView;
                if ((z4 || (imageViewA instanceof androidx.cardview.widget.CardView)) && (ff2VarA = ff2.a(zgVar, x8n.d)) != null) {
                    u8n.a(dllVar, zgVar, new x8n(ff2VarA, (byte) 1));
                }
                byte b3 = 2;
                if (z4 && (ff2VarA5 = ff2.a(zgVar, x8n.e)) != null) {
                    u8n.a(dllVar, zgVar, new x8n(ff2VarA5, b3));
                }
                byte b4 = 9;
                if (imageViewA instanceof SwitchCompat) {
                    TypedArray typedArrayObtainStyledAttributes2 = imageViewA.getContext().obtainStyledAttributes((AttributeSet) zgVar.c, zhh.x, zgVar.a, 0);
                    TypedValue typedValue = new TypedValue();
                    int i4 = typedArrayObtainStyledAttributes2.getValue(11, typedValue) ? typedValue.resourceId : 0;
                    int i5 = typedArrayObtainStyledAttributes2.getValue(2, typedValue) ? typedValue.resourceId : 0;
                    int i6 = typedArrayObtainStyledAttributes2.getValue(12, typedValue) ? typedValue.resourceId : 0;
                    int i7 = typedArrayObtainStyledAttributes2.getValue(9, typedValue) ? typedValue.resourceId : 0;
                    typedArrayObtainStyledAttributes2.recycle();
                    if (i4 != 0 || i5 != 0 || i6 != 0 || i7 != 0) {
                        u8n.a(dllVar, zgVar, new c9n(i5, i4, i7, i6));
                    }
                }
                if (((imageViewA instanceof ScrollView) || (imageViewA instanceof AbsListView) || (imageViewA instanceof tpi)) && !(imageViewA instanceof ThemeableRecyclerView)) {
                    u8n.a(dllVar, zgVar, new rpm(zgVar, (byte) 1));
                }
                if (imageViewA instanceof AppCompatSeekBar) {
                    u8n.a(dllVar, zgVar, new a9n(ff2.a(zgVar, a9n.z), ff2.a(zgVar, a9n.A), ff2.a(zgVar, a9n.B), ff2.a(zgVar, a9n.C), ff2.a(zgVar, a9n.D), ff2.a(zgVar, a9n.E), (byte) 3));
                }
                if (imageViewA instanceof Toolbar) {
                    ff2 ff2VarA19 = ff2.a(zgVar, g9n.j);
                    if (ff2VarA19 == null) {
                        ff2VarA19 = ff2.a(zgVar, g9n.k);
                    }
                    u8n.a(dllVar, zgVar, new g9n(ff2.a(zgVar, g9n.f), ff2.a(zgVar, g9n.g), ff2.a(zgVar, g9n.h), ff2.a(zgVar, g9n.i), ff2VarA19));
                }
                if (imageViewA instanceof CollapsingToolbarLayout) {
                    b = 1;
                    u8n.a(dllVar, zgVar, new w8n(ff2.a(zgVar, w8n.k), ff2.a(zgVar, w8n.l), ff2.a(zgVar, w8n.m), (byte) 1));
                } else {
                    b = 1;
                }
                boolean z5 = imageViewA instanceof ImageView;
                if (z5) {
                    ff2 ff2VarA20 = ff2.a(zgVar, z8n.d);
                    if (ff2VarA20 != null) {
                        u8n.a(dllVar, zgVar, new z8n(ff2VarA20, b));
                    } else if ((imageViewA instanceof AppCompatImageView) && (ff2VarA4 = ff2.a(zgVar, z8n.c)) != null) {
                        u8n.a(dllVar, zgVar, new z8n(ff2VarA4, (byte) 0));
                    }
                }
                ff2 ff2VarA21 = ff2.a(zgVar, x8n.g);
                ff2 ff2VarA22 = ff2.a(zgVar, x8n.h);
                ff2 ff2VarA23 = ff2.a(zgVar, x8n.i);
                if (!ff2.b(ff2VarA21) || !ff2.b(ff2VarA22) || !ff2.b(ff2VarA23)) {
                    if (ff2.b(ff2VarA21)) {
                        ff2VarA21 = !ff2.b(ff2VarA22) ? ff2VarA22 : ff2VarA23;
                    }
                    if (z5) {
                        u8n.a(dllVar, zgVar, new x8n(ff2VarA21, b2));
                    }
                }
                if (imageViewA instanceof FloatingActionButton) {
                    ff2 ff2VarA24 = ff2.a(zgVar, y8n.h);
                    ff2 ff2VarA25 = ff2.a(zgVar, y8n.i);
                    ff2 ff2VarA26 = ff2.a(zgVar, y8n.f);
                    ff2 ff2VarA27 = ff2.a(zgVar, y8n.g);
                    if (ff2VarA24 != null || ff2VarA25 != null || ff2VarA26 != null || ff2VarA27 != null) {
                        u8n.a(dllVar, zgVar, new y8n(ff2VarA24, ff2VarA25, ff2VarA26, ff2VarA27, (byte) 0));
                    }
                }
                if (imageViewA instanceof TextInputLayout) {
                    u8n.a(dllVar, zgVar, new d9n(ff2.a(zgVar, d9n.m), d9n.b(zgVar, d9n.n, d9n.o), d9n.b(zgVar, d9n.p, d9n.q), d9n.b(zgVar, d9n.r, d9n.s), d9n.b(zgVar, d9n.t, d9n.u), d9n.b(zgVar, d9n.v, d9n.w), ff2.a(zgVar, d9n.x), ff2.a(zgVar, d9n.y), ff2.a(zgVar, d9n.z), ff2.a(zgVar, d9n.A), ff2.a(zgVar, d9n.B), ff2.a(zgVar, d9n.C)));
                }
                if (imageViewA instanceof MaterialButton) {
                    ff2 ff2VarA28 = ff2.a(zgVar, y8n.j);
                    ff2 ff2VarA29 = ff2.a(zgVar, y8n.k);
                    ff2 ff2VarA30 = ff2.a(zgVar, y8n.l);
                    ff2 ff2VarA31 = ff2.a(zgVar, y8n.m);
                    if (ff2VarA28 != null || ff2VarA29 != null || ff2VarA30 != null || ff2VarA31 != null) {
                        u8n.a(dllVar, zgVar, new y8n(ff2VarA28, ff2VarA29, ff2VarA30, ff2VarA31, (byte) 1));
                    }
                }
                byte b5 = 7;
                if (imageViewA instanceof MaterialCheckBox) {
                    ff2 ff2VarA32 = ff2.a(zgVar, v8n.r);
                    ff2 ff2VarA33 = ff2.a(zgVar, v8n.s);
                    if (ff2VarA32 != null || ff2VarA33 != null) {
                        u8n.a(dllVar, zgVar, new v8n(ff2VarA32, ff2VarA33, b5));
                    }
                }
                byte b6 = 5;
                if ((imageViewA instanceof wdd) && (ff2VarA3 = ff2.a(zgVar, x8n.j)) != null) {
                    u8n.a(dllVar, zgVar, new x8n(ff2VarA3, b6));
                }
                if (imageViewA instanceof ThemeableLottieAnimationView) {
                    u8n.a(dllVar, zgVar, new f9n());
                }
                if ((imageViewA instanceof PageDotIndicator) && (ff2VarA2 = ff2.a(zgVar, x8n.l)) != null) {
                    u8n.a(dllVar, zgVar, new x8n(ff2VarA2, b5));
                }
                if (imageViewA instanceof Chip) {
                    ff2 ff2VarA34 = ff2.a(zgVar, a9n.h);
                    ff2 ff2VarA35 = ff2.a(zgVar, a9n.i);
                    ff2 ff2VarA36 = ff2.a(zgVar, a9n.j);
                    ff2 ff2VarA37 = ff2.a(zgVar, a9n.k);
                    ff2 ff2VarA38 = ff2.a(zgVar, a9n.l);
                    ff2 ff2VarA39 = ff2.a(zgVar, a9n.m);
                    if (ff2VarA34 != null || ff2VarA35 != null || ff2VarA36 != null || ff2VarA37 != null || ff2VarA38 != null || ff2VarA39 != null) {
                        u8n.a(dllVar, zgVar, new a9n(ff2VarA34, ff2VarA35, ff2VarA36, ff2VarA37, ff2VarA38, ff2VarA39, (byte) 0));
                    }
                }
                if (imageViewA instanceof TabLayout) {
                    u8n.a(dllVar, zgVar, new a9n(ff2.a(zgVar, a9n.F), ff2.a(zgVar, a9n.G), ff2.a(zgVar, a9n.H), ff2.a(zgVar, a9n.I), ff2.a(zgVar, a9n.J), ff2.a(zgVar, a9n.K), (byte) 4));
                }
                if (imageViewA instanceof AutoCompleteTextView) {
                    ff2 ff2VarA40 = ff2.a(zgVar, v8n.f);
                    ff2 ff2VarA41 = ff2.a(zgVar, v8n.g);
                    if (!ff2.b(ff2VarA40) || !ff2.b(ff2VarA41)) {
                        u8n.a(dllVar, zgVar, new v8n(ff2VarA40, ff2VarA41, (byte) 1));
                    }
                }
                byte b7 = 8;
                if (imageViewA instanceof MenuSettingsListItem) {
                    ff2 ff2VarA42 = ff2.a(zgVar, v8n.t);
                    ff2 ff2VarA43 = ff2.a(zgVar, v8n.u);
                    if (ff2VarA42 != null || ff2VarA43 != null) {
                        u8n.a(dllVar, zgVar, new v8n(ff2VarA42, ff2VarA43, b7));
                    }
                }
                if (imageViewA instanceof SettingsStatisticView) {
                    u8n.a(dllVar, zgVar, new x8n(ff2.a(zgVar, x8n.m), b7));
                }
                if (imageViewA instanceof StatusBarDrawingFrameLayout) {
                    ff2 ff2VarA44 = ff2.a(zgVar, v8n.x);
                    ff2 ff2VarA45 = ff2.a(zgVar, v8n.y);
                    if (!ff2.b(ff2VarA44) || !ff2.b(ff2VarA45)) {
                        u8n.a(dllVar, zgVar, new v8n(ff2VarA44, ff2VarA45, (byte) 10));
                    }
                }
                if (imageViewA instanceof OperaIconedMessage) {
                    ff2 ff2VarA46 = ff2.a(zgVar, a9n.n);
                    ff2 ff2VarA47 = ff2.a(zgVar, a9n.o);
                    ff2 ff2VarA48 = ff2.a(zgVar, a9n.p);
                    ff2 ff2VarA49 = ff2.a(zgVar, a9n.q);
                    ff2 ff2VarA50 = ff2.a(zgVar, a9n.r);
                    ff2 ff2VarA51 = ff2.a(zgVar, a9n.s);
                    if (ff2VarA46 != null || ff2VarA47 != null || ff2VarA48 != null || ff2VarA49 != null || ff2VarA50 != null || ff2VarA51 != null) {
                        u8n.a(dllVar, zgVar, new a9n(ff2VarA46, ff2VarA47, ff2VarA48, ff2VarA49, ff2VarA50, ff2VarA51, (byte) 1));
                    }
                }
                if (imageViewA instanceof OperaListItem) {
                    u8n.a(dllVar, zgVar, new a9n(ff2.a(zgVar, a9n.t), ff2.a(zgVar, a9n.u), ff2.a(zgVar, a9n.v), ff2.a(zgVar, a9n.w), ff2.a(zgVar, a9n.x), ff2.a(zgVar, a9n.y), (byte) 2));
                }
                if (imageViewA instanceof OperaProgressIndicator) {
                    u8n.a(dllVar, zgVar, new v8n(ff2.a(zgVar, v8n.v), ff2.a(zgVar, v8n.w), b4));
                }
                boolean z6 = imageViewA instanceof Slider;
                if (z6 || (imageViewA instanceof h)) {
                    u8n.a(dllVar, zgVar, new b9n(ff2.a(zgVar, b9n.o), ff2.a(zgVar, b9n.p), ff2.a(zgVar, b9n.q), ff2.a(zgVar, b9n.r), ff2.a(zgVar, b9n.s), ff2.a(zgVar, b9n.t), ff2.a(zgVar, b9n.u), ff2.a(zgVar, b9n.v), ff2.a(zgVar, b9n.w), ff2.a(zgVar, b9n.x), ff2.a(zgVar, b9n.y), ff2.a(zgVar, b9n.z), ff2.a(zgVar, b9n.A), ff2.a(zgVar, b9n.B)));
                }
                if (z6) {
                    u8n.a(dllVar, zgVar, new v8n(ff2.a(zgVar, v8n.n), ff2.a(zgVar, v8n.o), b6));
                }
                if (z3) {
                    ff2 ff2VarA52 = ff2.a(zgVar, v8n.d);
                    ff2 ff2VarA53 = ff2.a(zgVar, v8n.e);
                    if (ff2VarA52 != null || ff2VarA53 != null) {
                        u8n.a(dllVar, zgVar, new v8n(ff2VarA53, ff2VarA52, (byte) 0));
                    }
                }
                byte b8 = 6;
                if (imageViewA instanceof LinearProgressIndicator) {
                    u8n.a(dllVar, zgVar, new v8n(ff2.a(zgVar, v8n.p), ff2.a(zgVar, v8n.q), b8));
                }
                if (imageViewA instanceof CircularProgressIndicator) {
                    u8n.a(dllVar, zgVar, new v8n(ff2.a(zgVar, v8n.h), ff2.a(zgVar, v8n.i), b3));
                }
                if (imageViewA instanceof OperaMediaRouteButton) {
                    u8n.a(dllVar, zgVar, new x8n(ff2.a(zgVar, x8n.k), b8));
                }
                if (z2) {
                    ff2 ff2VarA54 = ff2.a(zgVar, e9n.h);
                    ff2 ff2VarA55 = ff2.a(zgVar, e9n.i);
                    ff2 ff2VarA56 = ff2.a(zgVar, e9n.j);
                    ff2 ff2VarA57 = ff2.a(zgVar, e9n.k);
                    ff2 ff2VarA58 = ff2.a(zgVar, e9n.l);
                    ff2 ff2VarA59 = ff2.a(zgVar, e9n.m);
                    ff2 ff2VarA60 = ff2.a(zgVar, e9n.n);
                    if (!ff2.b(ff2VarA54) || !ff2.b(ff2VarA55) || !ff2.b(ff2VarA56) || !ff2.b(ff2VarA57) || !ff2.b(ff2VarA58) || !ff2.b(ff2VarA59) || !ff2.b(ff2VarA60)) {
                        u8n.a(dllVar, zgVar, new e9n(ff2VarA54, ff2VarA55, ff2VarA56, ff2VarA57, ff2VarA58, ff2VarA59, ff2VarA60));
                    }
                }
                if (imageViewA instanceof StylingImageCheckableWithText) {
                    ff2 ff2VarA61 = ff2.a(zgVar, y8n.n);
                    ff2 ff2VarA62 = ff2.a(zgVar, y8n.o);
                    ff2 ff2VarA63 = ff2.a(zgVar, y8n.p);
                    ff2 ff2VarA64 = ff2.a(zgVar, y8n.q);
                    if (ff2VarA61 != null || ff2VarA62 != null || ff2VarA63 != null || ff2VarA64 != null) {
                        u8n.a(dllVar, zgVar, new y8n(ff2VarA61, ff2VarA62, ff2VarA63, ff2VarA64, (byte) 2));
                    }
                }
                if (this.d != null) {
                    int i8 = BrowserActivity.E1;
                    if (imageViewA instanceof TextView) {
                        TextView textView = imageViewA;
                        l5b l5bVar = q9n.c;
                        if (textView.isTextSelectable() || (textView instanceof EditText)) {
                            textView.setCustomSelectionActionModeCallback(new we(textView, textView.getId() == 2131364965 ? hrj.f & (-2) : hrj.f));
                            if ((imageViewA instanceof ListMenuItemView) && (view instanceof gud) && (viewM = q9n.m((im7) view)) != null) {
                                String[] strArr2 = OperaApplication.K;
                                ((OperaApplication) imageViewA.getContext().getApplicationContext()).B().b(viewM);
                            }
                        }
                    } else if (imageViewA instanceof ListMenuItemView) {
                        String[] strArr22 = OperaApplication.K;
                        ((OperaApplication) imageViewA.getContext().getApplicationContext()).B().b(viewM);
                    }
                }
            } else {
                if (baseContext instanceof tpj) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
        }
        return imageViewA;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return null;
    }
}
