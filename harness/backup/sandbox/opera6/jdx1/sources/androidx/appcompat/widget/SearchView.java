package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import defpackage.afc;
import defpackage.fti;
import defpackage.gp1;
import defpackage.gti;
import defpackage.ho3;
import defpackage.hti;
import defpackage.iti;
import defpackage.j85;
import defpackage.jti;
import defpackage.kti;
import defpackage.lq1;
import defpackage.m46;
import defpackage.mic;
import defpackage.n5n;
import defpackage.r5n;
import defpackage.tqk;
import defpackage.zhh;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends afc implements j85 {
    public static final /* synthetic */ int h0 = 0;
    public final Rect A;
    public final int[] B;
    public final int[] C;
    public final ImageView D;
    public final int E;
    public final int F;
    public final Intent G;
    public final Intent H;
    public final CharSequence I;
    public hti J;
    public View.OnFocusChangeListener K;
    public View.OnClickListener L;
    public boolean M;
    public boolean N;
    public m46 O;
    public boolean P;
    public CharSequence Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public String V;
    public CharSequence W;
    public boolean a0;
    public int b0;
    public SearchableInfo c0;
    public Bundle d0;
    public final fti e0;
    public final fti f0;
    public final WeakHashMap g0;
    private final Drawable mSearchHintIcon;
    public final SearchAutoComplete p;
    public final View q;
    public final View r;
    public final View s;
    public final ImageView t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final View x;
    public kti y;
    public final Rect z;

    public static class SearchAutoComplete extends gp1 {
        public int e;
        public SearchView f;
        public boolean g;
        public final c h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h = new c(this);
            this.e = getThreshold();
        }

        public final void a(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.h;
            if (!z) {
                this.g = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.g = true;
                    return;
                }
                this.g = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        @Override // defpackage.gp1, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.g) {
                c cVar = this.h;
                removeCallbacks(cVar);
                post(cVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            setMinWidth((int) TypedValue.applyDimension(1, (i < 960 || i2 < 720 || configuration.orientation != 2) ? (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160 : NotificationCompat.FLAG_LOCAL_ONLY, displayMetrics));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f;
            searchView.t(searchView.isIconified());
            searchView.post(searchView.e0);
            SearchAutoComplete searchAutoComplete = searchView.p;
            if (searchAutoComplete.hasFocus()) {
                searchAutoComplete.refreshAutoCompleteResults();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        a(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f.hasFocus() && getVisibility() == 0) {
                this.g = true;
                Context context = getContext();
                int i = SearchView.h0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    setInputMethodMode(1);
                    if (enoughToFilter()) {
                        showDropDown();
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970676);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.e0 = new fti(this, (byte) 0);
        byte b = 1;
        this.f0 = new fti(this, b);
        this.g0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        TextView.OnEditorActionListener x39Var = new x39(this, (byte) 2);
        lq1 lq1Var = new lq1(this, (byte) 2);
        mic micVar = new mic(this, b);
        TextWatcher h63Var = new h63(this, (byte) 4);
        int[] iArr = zhh.v;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ghf ghfVar = new ghf(context, typedArrayObtainStyledAttributes);
        WeakHashMap weakHashMap = r5n.a;
        n5n.b(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(21, 2131558425), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(2131364166);
        this.p = searchAutoComplete;
        searchAutoComplete.f = this;
        this.q = findViewById(2131364153);
        View viewFindViewById = findViewById(2131364162);
        this.r = viewFindViewById;
        View viewFindViewById2 = findViewById(2131364592);
        this.s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(2131364149);
        this.t = imageView;
        ImageView imageView2 = (ImageView) findViewById(2131364158);
        this.u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(2131364151);
        this.v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(2131364170);
        this.w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(2131364160);
        this.D = imageView5;
        viewFindViewById.setBackground(ghfVar.t(22));
        viewFindViewById2.setBackground(ghfVar.t(27));
        imageView.setImageDrawable(ghfVar.t(25));
        imageView2.setImageDrawable(ghfVar.t(17));
        imageView3.setImageDrawable(ghfVar.t(12));
        imageView4.setImageDrawable(ghfVar.t(30));
        imageView5.setImageDrawable(ghfVar.t(25));
        this.mSearchHintIcon = ghfVar.t(24);
        imageView.setTooltipText(getResources().getString(2132017174));
        this.E = typedArrayObtainStyledAttributes.getResourceId(28, 2131558424);
        this.F = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(h63Var);
        searchAutoComplete.setOnEditorActionListener(x39Var);
        searchAutoComplete.setOnItemClickListener(lq1Var);
        searchAutoComplete.setOnItemSelectedListener(micVar);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new y39(this, (byte) 2));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(20, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.I = typedArrayObtainStyledAttributes.getText(15);
        this.Q = typedArrayObtainStyledAttributes.getText(23);
        byte b2 = 6;
        int i2 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        ghfVar.J();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.G = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.H = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new ho3(this, b2));
        }
        t(this.M);
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.a(false);
        this.S = false;
    }

    public int getImeOptions() {
        return this.p.getImeOptions();
    }

    public int getInputType() {
        return this.p.getInputType();
    }

    public int getMaxWidth() {
        return this.T;
    }

    public CharSequence getQuery() {
        return this.p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.c0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.I : getContext().getText(this.c0.getHintId());
    }

    public m46 getSuggestionsAdapter() {
        return this.O;
    }

    public final Intent h(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.c0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.d0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public boolean isIconfiedByDefault() {
        return this.M;
    }

    public boolean isIconified() {
        return this.N;
    }

    public boolean isQueryRefinementEnabled() {
        return this.R;
    }

    public boolean isSubmitButtonEnabled() {
        return this.P;
    }

    public final void j() {
        SearchAutoComplete searchAutoComplete = this.p;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.a(true);
        } else if (this.M) {
            clearFocus();
            t(true);
        }
    }

    public final void l(int i) {
        String strH;
        Cursor cursor = this.O.c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentH = null;
            try {
                try {
                    int i2 = tqk.y;
                    String strH2 = tqk.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strH2 == null) {
                        strH2 = this.c0.getSuggestIntentAction();
                    }
                    if (strH2 == null) {
                        strH2 = "android.intent.action.SEARCH";
                    }
                    String strH3 = tqk.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strH3 == null) {
                        strH3 = this.c0.getSuggestIntentData();
                    }
                    if (strH3 != null && (strH = tqk.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strH3 = strH3 + "/" + Uri.encode(strH);
                    }
                    intentH = h(strH3 == null ? null : Uri.parse(strH3), strH2, tqk.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), tqk.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intentH != null) {
                try {
                    getContext().startActivity(intentH);
                } catch (RuntimeException unused3) {
                    intentH.toString();
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.a(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.p;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        hti htiVar = this.J;
        if (htiVar != null) {
            htiVar.v(text.toString());
            return;
        }
        if (this.c0 != null) {
            getContext().startActivity(h(null, "android.intent.action.SEARCH", null, text.toString()));
        }
        searchAutoComplete.a(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void n(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void o() {
        boolean zIsEmpty = TextUtils.isEmpty(this.p.getText());
        int i = (!zIsEmpty || (this.M && !this.a0)) ? 0 : 8;
        ImageView imageView = this.v;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // defpackage.j85
    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        t(true);
        this.p.setImeOptions(this.b0);
        this.a0 = false;
    }

    @Override // defpackage.j85
    public void onActionViewExpanded() {
        if (this.a0) {
            return;
        }
        this.a0 = true;
        SearchAutoComplete searchAutoComplete = this.p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.b0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.e0);
        post(this.f0);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.afc, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.p;
            int[] iArr = this.B;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.C;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.z;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.A;
            rect2.set(i7, 0, i8, i9);
            kti ktiVar = this.y;
            if (ktiVar == null) {
                kti ktiVar2 = new kti(rect2, rect, searchAutoComplete);
                this.y = ktiVar2;
                setTouchDelegate(ktiVar2);
            } else {
                ktiVar.b.set(rect2);
                Rect rect3 = ktiVar.d;
                rect3.set(rect2);
                int i10 = -ktiVar.e;
                rect3.inset(i10, i10);
                ktiVar.c.set(rect);
            }
        }
    }

    @Override // defpackage.afc, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        int i3;
        if (isIconified()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.T;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getContext().getResources().getDimensionPixelSize(2131165239), size);
        } else if (mode == 0) {
            size = this.T;
            if (size <= 0) {
                size = getContext().getResources().getDimensionPixelSize(2131165239);
            }
        } else if (mode == 1073741824 && (i3 = this.T) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getContext().getResources().getDimensionPixelSize(2131165238), size2);
        } else if (mode2 == 0) {
            size2 = getContext().getResources().getDimensionPixelSize(2131165238);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof jti)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        jti jtiVar = (jti) parcelable;
        super.onRestoreInstanceState(jtiVar.a);
        t(jtiVar.c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        jti jtiVar = new jti(super.onSaveInstanceState());
        jtiVar.c = isIconified();
        return jtiVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.e0);
    }

    public final void p() {
        int[] iArr = this.p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void q() {
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.M;
        SearchAutoComplete searchAutoComplete = this.p;
        if (z && this.mSearchHintIcon != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            this.mSearchHintIcon.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void r() {
        this.s.setVisibility(((this.P || this.U) && !isIconified() && (this.u.getVisibility() == 0 || this.w.getVisibility() == 0)) ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.S || !isFocusable()) {
            return false;
        }
        if (isIconified()) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.p.requestFocus(i, rect);
        if (zRequestFocus) {
            t(false);
        }
        return zRequestFocus;
    }

    public final void s(boolean z) {
        boolean z2 = this.P;
        this.u.setVisibility((!z2 || !(z2 || this.U) || isIconified() || !hasFocus() || (!z && this.U)) ? 8 : 0);
    }

    public void setAppSearchData(Bundle bundle) {
        this.d0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            j();
            return;
        }
        t(false);
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.a(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.M == z) {
            return;
        }
        this.M = z;
        t(z);
        q();
    }

    public void setImeOptions(int i) {
        this.p.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.p.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.T = i;
        requestLayout();
    }

    public void setOnCloseListener(gti gtiVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(hti htiVar) {
        this.J = htiVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setOnSuggestionListener(iti itiVar) {
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.W = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.Q = charSequence;
        q();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.R = z;
        m46 m46Var = this.O;
        if (m46Var instanceof tqk) {
            ((tqk) m46Var).q = z ? (byte) 2 : (byte) 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.c0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.p
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.c0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.c0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.c0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            m46 r7 = r6.O
            if (r7 == 0) goto L3b
            r7.b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.c0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            tqk r7 = new tqk
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.c0
            java.util.WeakHashMap r5 = r6.g0
            r7.<init>(r3, r6, r4, r5)
            r6.O = r7
            r2.setAdapter(r7)
            m46 r7 = r6.O
            tqk r7 = (defpackage.tqk) r7
            boolean r3 = r6.R
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.q = r3
        L62:
            r6.q()
        L65:
            android.app.SearchableInfo r7 = r6.c0
            r3 = 0
            if (r7 == 0) goto L97
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L97
            android.app.SearchableInfo r7 = r6.c0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.G
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.c0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.H
        L85:
            if (r0 == 0) goto L97
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 != 0) goto L98
        L97:
            r1 = r3
        L98:
            r6.U = r1
            if (r1 == 0) goto La1
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La1:
            boolean r7 = r6.isIconified()
            r6.t(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.P = z;
        t(isIconified());
    }

    public void setSuggestionsAdapter(m46 m46Var) {
        this.O = m46Var;
        this.p.setAdapter(m46Var);
    }

    public final void t(boolean z) {
        this.N = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.p.getText());
        this.t.setVisibility(i2);
        s(!zIsEmpty);
        this.q.setVisibility(z ? 8 : 0);
        ImageView imageView = this.D;
        if (imageView.getDrawable() != null && !this.M) {
            i = 0;
        }
        imageView.setVisibility(i);
        o();
        u(zIsEmpty);
        r();
    }

    public final void u(boolean z) {
        int i = 8;
        if (this.U && !isIconified() && z) {
            this.u.setVisibility(8);
            i = 0;
        }
        this.w.setVisibility(i);
    }
}
