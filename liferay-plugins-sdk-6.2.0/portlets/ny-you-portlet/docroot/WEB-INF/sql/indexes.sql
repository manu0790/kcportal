create index IX_EE3E41C6 on nyyou_AnswerRequest (requestLessonId);
create index IX_7187400 on nyyou_AnswerRequest (requestLessonId, userId);

create index IX_BE3CAB9E on nyyou_AuditReport (companyId);
create index IX_E4EC7B1A on nyyou_AuditReport (eventType);

create index IX_B410CD47 on nyyou_DocumentFile (companyId, lessonId);
create index IX_D24283FB on nyyou_DocumentFile (docUuid);
create index IX_8D9618E2 on nyyou_DocumentFile (docUuid, lessonId);
create index IX_CCE6C978 on nyyou_DocumentFile (docUuid, resourceId);
create index IX_F4B8E52F on nyyou_DocumentFile (lessonId);
create index IX_4232A74B on nyyou_DocumentFile (lessonId, resourceType);
create index IX_8CE66B31 on nyyou_DocumentFile (lessonId, resourceType, status);
create index IX_CDCD26EC on nyyou_DocumentFile (resourceId, lessonId);

create index IX_1BB7F5CC on nyyou_DocumentSection (lessonId);

create index IX_BEF9459D on nyyou_FavouriteLessons (userId);

create index IX_EA500EFE on nyyou_KeywordsCollaboration (keywordId);
create index IX_9E058938 on nyyou_KeywordsCollaboration (keywordId, userId);
create index IX_DC63C7BC on nyyou_KeywordsCollaboration (status);
create index IX_7DE2E110 on nyyou_KeywordsCollaboration (userId);

create index IX_1C1A17FF on nyyou_Lesson (companyId);
create index IX_42169716 on nyyou_Lesson (companyId, lessonName);
create index IX_98C0C6B on nyyou_Lesson (currentAuthor);
create index IX_7398B051 on nyyou_Lesson (currentAuthor, status);
create index IX_B8F69241 on nyyou_Lesson (groupId);
create index IX_9ED66B3F on nyyou_Lesson (groupId, lessonStatus);
create index IX_ABC23624 on nyyou_Lesson (lessonId, currentAuthor);
create index IX_B845ECA0 on nyyou_Lesson (lessonName);
create index IX_6C3ABC37 on nyyou_Lesson (lessonPrivacy);
create index IX_5C568A3B on nyyou_Lesson (markedAs);
create index IX_88F7926F on nyyou_Lesson (status);
create index IX_915DC10B on nyyou_Lesson (uuid_);
create index IX_24BBE3D on nyyou_Lesson (uuid_, companyId);
create unique index IX_2738AFFF on nyyou_Lesson (uuid_, groupId);

create index IX_3CB99A36 on nyyou_LessonCollaboration (lessonId, accessPermission);
create index IX_4388A94F on nyyou_LessonCollaboration (lessonId, memberStatus);
create index IX_5648A186 on nyyou_LessonCollaboration (lessonId, type_);
create index IX_8B3016A9 on nyyou_LessonCollaboration (lessonId, userId);
create index IX_E5995309 on nyyou_LessonCollaboration (userId, accessPermission);
create index IX_32A42E93 on nyyou_LessonCollaboration (userId, type_);

create index IX_6823E3AA on nyyou_LessonObjectives (lessonId);

create index IX_74250709 on nyyou_Lesson_Usergroups (groupId);
create index IX_8472CC28 on nyyou_Lesson_Usergroups (lessonId);

create index IX_F8C4D22D on nyyou_NYUUserGroup (companyId);
create index IX_BC5FFEF on nyyou_NYUUserGroup (groupId);
create index IX_9578DFD5 on nyyou_NYUUserGroup (groupId, status);
create index IX_A2E98B98 on nyyou_NYUUserGroup (groupPrivacy);
create index IX_1AE8C239 on nyyou_NYUUserGroup (uuid_);
create index IX_B771D44F on nyyou_NYUUserGroup (uuid_, companyId);
create unique index IX_58B12291 on nyyou_NYUUserGroup (uuid_, groupId);

create index IX_A1AD6826 on nyyou_RequestLesson (companyId);
create index IX_64CB5E4 on nyyou_RequestLesson (createdDate);

create index IX_3B597E01 on nyyou_Slides (id_);

create index IX_107FBF62 on nyyou_UserBadges (badgeId);
create index IX_70B23E26 on nyyou_UserBadges (userId);
create index IX_BCB23468 on nyyou_UserBadges (userId, badgeId);

create index IX_46B96B89 on nyyou_UserGroupRequest (requestedBy);
create index IX_6DB793E2 on nyyou_UserGroupRequest (userGroupId, requestedBy);
create index IX_C453E39 on nyyou_UserGroupRequest (userGroupId, status);