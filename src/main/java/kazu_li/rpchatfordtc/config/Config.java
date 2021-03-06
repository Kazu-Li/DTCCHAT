package kazu_li.rpchatfordtc.config;


import space.arim.dazzleconf.annote.ConfComments;
import space.arim.dazzleconf.annote.ConfDefault;
import space.arim.dazzleconf.annote.ConfDefault.DefaultBoolean;
import space.arim.dazzleconf.annote.ConfHeader;
import space.arim.dazzleconf.annote.ConfKey;
import space.arim.dazzleconf.sorter.AnnotationBasedSorter;

@ConfHeader("#The config for the suggestions System.")
public interface Config {

    @ConfKey("enabled")
    @ConfDefault.DefaultBoolean(true)
    @ConfComments("\n#Should your bot use our Suggestions System?")
    @AnnotationBasedSorter.Order(10)
    boolean isEnabled();

    @ConfKey("suggestions-channel")
    @ConfDefault.DefaultLong(0000000L)
    @ConfComments("\n#The channel that suggestions are writen at.")
    @AnnotationBasedSorter.Order(20)
    Long channel();

    @ConfKey("yes-reaction")
    @ConfDefault.DefaultString("white_check_mark")
    @AnnotationBasedSorter.Order(30)
    @ConfComments("\n#Emoji to react in suggestions if \"yes\". Use name for that.")
    String emoji_yes();

    @ConfKey("no-reaction")
    @ConfDefault.DefaultString("x")
    @AnnotationBasedSorter.Order(40)
    @ConfComments("\n#Emoji to react in suggestions if \"no\". Use name for that.")
    String emoji_no();

    @ConfKey("send-dm-to-user-when-suggestion-replied")
    @DefaultBoolean(true)
    @AnnotationBasedSorter.Order(50)
    @ConfComments("\n#Should we send a DM to the user when their suggestion is replied (accepted or denied)")
    boolean sendDMToUserWhenSuggestionReplied();

    @ConfKey("disallow-submitter-to-vote")
    @DefaultBoolean(true)
    @AnnotationBasedSorter.Order(60)
    @ConfComments("\n#Disallow the person who submitted the suggestion to vote")
    boolean DisallowSubmitterToVote();

    @ConfKey("disallow-more-than-one-vote")
    @DefaultBoolean(true)
    @AnnotationBasedSorter.Order(70)
    @ConfComments("\n#Disallow people to vote yes and no together")
    boolean DisallowMoreThanOneVote();

    @ConfKey("suggestion-banned-role")
    @ConfDefault.DefaultLong(0L)
    @AnnotationBasedSorter.Order(80)
    @ConfComments("\n#This role wont be able to suggest.")
    Long SuggeestionBannedRole();

    @ConfKey("delete-suggestion-message-after-usage")
    @DefaultBoolean(true)
    @AnnotationBasedSorter.Order(90)
    @ConfComments("\n#Should we delete the suggestion sent by player which should have been sent in the bot commands channel?")
    Boolean DeleteSuggestionMessageAfterUsage();


}

