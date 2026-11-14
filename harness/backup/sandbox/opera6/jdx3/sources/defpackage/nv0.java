package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nv0 {
    public static final nv0 b;
    public static final nv0 c;
    public static final nv0 d;
    public static final nv0 e;
    public static final /* synthetic */ nv0[] f;
    public static final /* synthetic */ h58 g;
    public final String a;

    static {
        nv0 nv0Var = new nv0("MAIN_MENU", 0, "main_menu");
        nv0 nv0Var2 = new nv0("CHATS_LIST", 1, "chats_list");
        nv0 nv0Var3 = new nv0("ACCOUNT_IS_READY_DIALOG", 2, "account_is_ready_dialog");
        nv0 nv0Var4 = new nv0("DEEP_LINK", 3, "deep_link");
        nv0 nv0Var5 = new nv0("DRAG_BUBBLE", 4, "drag_bubble");
        nv0 nv0Var6 = new nv0("UNKNOWN", 5, "");
        b = nv0Var6;
        nv0 nv0Var7 = new nv0("WIDGET", 6, "widget");
        nv0 nv0Var8 = new nv0("PAGE_CONTEXT_MENU", 7, "page_context_menu");
        c = nv0Var8;
        nv0 nv0Var9 = new nv0("TEXT_SELECTION_CONTEXT_MENU", 8, "text_selection_context_menu");
        nv0 nv0Var10 = new nv0("SUMMARIZE_OMNIBAR_SHORTCUT", 9, "summarize_omnibar_shortcut");
        nv0 nv0Var11 = new nv0("BOTTOM_NAVIGATION_TOOLBAR", 10, "bottom_navigation_toolbar");
        nv0 nv0Var12 = new nv0("BOTTOM_NAVIGATION_TOOLBAR_ARIA_INSTEAD_OF_SEARCH", 11, "bottom_navigation_toolbar_aria_instead_of_search");
        nv0 nv0Var13 = new nv0("WEB_IMAGE_CONTEXT_MENU", 12, "web_image_context_menu");
        nv0 nv0Var14 = new nv0("TAB_GALLERY_TAB_COMMANDS", 13, "tab_gallery_tab_commands");
        nv0 nv0Var15 = new nv0("SHORTCUT_WIDGET", 14, "shortcut_widget_aria");
        nv0 nv0Var16 = new nv0("SEARCH_IN_TAB", 15, "ai_search_tab");
        d = nv0Var16;
        nv0 nv0Var17 = new nv0("AI_SUGGESTION_TILE", 16, "ai_suggestion_tile");
        e = nv0Var17;
        nv0[] nv0VarArr = {nv0Var, nv0Var2, nv0Var3, nv0Var4, nv0Var5, nv0Var6, nv0Var7, nv0Var8, nv0Var9, nv0Var10, nv0Var11, nv0Var12, nv0Var13, nv0Var14, nv0Var15, nv0Var16, nv0Var17, new nv0("DOWNLOAD_UI", 17, "download_ui"), new nv0("DOWNLOAD_DIALOG", 18, "download_dialog"), new nv0("OMNIBAR", 19, "omnibar")};
        f = nv0VarArr;
        g = new h58(nv0VarArr);
    }

    public nv0(String str, int i, String str2) {
        this.a = str2;
    }

    public static nv0 valueOf(String str) {
        return (nv0) Enum.valueOf(nv0.class, str);
    }

    public static nv0[] values() {
        return (nv0[]) f.clone();
    }
}
