package defpackage;

import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class o0j {
    public static final /* synthetic */ xtb[] a = {new pee(o0j.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new pee(o0j.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new pee(o0j.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new pee(o0j.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new pee(o0j.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new pee(o0j.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new pee(o0j.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new pee(o0j.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new pee(o0j.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new pee(o0j.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new pee(o0j.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", 1), new pee(o0j.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new pee(o0j.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new pee(o0j.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new pee(o0j.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new pee(o0j.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new pee(o0j.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new pee(o0j.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new pee(o0j.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new pee(o0j.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new pee(o0j.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new pee(o0j.class, "textCompositionRange", "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;", 1), new pee(o0j.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new pee(o0j.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new pee(o0j.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new pee(o0j.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new pee(o0j.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new pee(o0j.class, "inputTextSuggestionState", "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;", 1), new pee(o0j.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new pee(o0j.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new pee(o0j.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1), new pee(o0j.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        p0j p0jVar = n0j.a;
        p0j p0jVar2 = e0j.a;
    }

    public static void a(q0j q0jVar, Function1 function1) {
        q0jVar.b(e0j.a, new c8(null, (br9) function1));
    }

    public static void b(q0j q0jVar, Function1 function1) {
        q0jVar.b(e0j.h, new c8(null, (br9) function1));
    }

    public static final void c(q0j q0jVar, p41 p41Var) {
        p0j p0jVar = n0j.s;
        xtb xtbVar = a[9];
        p0jVar.getClass();
        q0jVar.b(p0jVar, p41Var);
    }

    public static final void d(q0j q0jVar, String str) {
        p0j p0jVar = n0j.a;
        q0jVar.b(n0j.a, Collections.singletonList(str));
    }

    public static final void e(q0j q0jVar, q41 q41Var) {
        p0j p0jVar = n0j.r;
        xtb xtbVar = a[8];
        p0jVar.getClass();
        q0jVar.b(p0jVar, q41Var);
    }

    public static final void f(q0j q0jVar, e61 e61Var) {
        p0j p0jVar = n0j.t;
        xtb xtbVar = a[10];
        p0jVar.getClass();
        q0jVar.b(p0jVar, e61Var);
    }

    public static final void g(q0j q0jVar, String str) {
        p0j p0jVar = n0j.a;
        p0j p0jVar2 = n0j.d;
        xtb xtbVar = a[2];
        p0jVar2.getClass();
        q0jVar.b(p0jVar2, str);
    }

    public static final void h(q0j q0jVar, int i) {
        p0j p0jVar = n0j.z;
        xtb xtbVar = a[14];
        q5i q5iVar = new q5i(i);
        p0jVar.getClass();
        q0jVar.b(p0jVar, q5iVar);
    }

    public static final void i(q0j q0jVar, paj pajVar) {
        p0j p0jVar = n0j.a;
        p0j p0jVar2 = n0j.S;
        xtb xtbVar = a[30];
        p0jVar2.getClass();
        q0jVar.b(p0jVar2, pajVar);
    }

    public static final void j(q0j q0jVar, bsl bslVar) {
        p0j p0jVar = n0j.a;
        p0j p0jVar2 = n0j.L;
        xtb xtbVar = a[26];
        p0jVar2.getClass();
        q0jVar.b(p0jVar2, bslVar);
    }

    public static final void k(q0j q0jVar) {
        p0j p0jVar = n0j.n;
        xtb xtbVar = a[6];
        Boolean bool = Boolean.TRUE;
        p0jVar.getClass();
        q0jVar.b(p0jVar, bool);
    }
}
