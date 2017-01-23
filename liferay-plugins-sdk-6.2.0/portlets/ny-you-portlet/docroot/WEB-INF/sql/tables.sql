create table nyyou_AnswerRequest (
	answerId LONG not null primary key IDENTITY,
	requestLessonId LONG,
	userId LONG,
	description TEXT null,
	appreciateUserIds VARCHAR(75) null,
	appreciateCount INTEGER,
	createDate DATE null,
	checkedAnswer BOOLEAN,
	opinionSurvey TEXT null,
	myLessons TEXT null,
	myFavouriteLessons TEXT null,
	collaborationLessons LONG,
	collaborationId LONG
);

create table nyyou_AuditReport (
	auditEventId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	eventType VARCHAR(75) null,
	className VARCHAR(500) null,
	classPK VARCHAR(75) null,
	message VARCHAR(1000) null,
	clientHost VARCHAR(75) null,
	clientIP VARCHAR(75) null,
	serverName VARCHAR(500) null,
	serverPort INTEGER,
	sessionID VARCHAR(75) null,
	additionalInfo VARCHAR(1000) null
);

create table nyyou_Basno (
	badgeId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	badgeName VARCHAR(500) null,
	badgeUrl VARCHAR(1000) null,
	description TEXT null,
	targetPoints LONG,
	createdDate DATE null,
	createdBy LONG,
	updatedDate DATE null,
	updatedBy LONG
);

create table nyyou_DocumentFile (
	documentId LONG not null primary key IDENTITY,
	companyId LONG,
	groupId LONG,
	lessonId LONG,
	sectionId LONG,
	documentName STRING null,
	documentDesc STRING null,
	documentPath VARCHAR(1000) null,
	resourceId LONG,
	collectionId LONG,
	resourceType VARCHAR(75) null,
	downloadUrl VARCHAR(1000) null,
	docUuid VARCHAR(75) null,
	hasAutoTranscript VARCHAR(75) null,
	createdDate DATE null,
	permission VARCHAR(75) null,
	status VARCHAR(75) null
);

create table nyyou_DocumentSection (
	id_ LONG not null primary key IDENTITY,
	lessonId LONG,
	documentId LONG,
	modifiedDate DATE null,
	sectionTitle VARCHAR(500) null,
	sectionNote TEXT null,
	lessonObjectiveIds TEXT null,
	order_ INTEGER
);

create table nyyou_FavouriteLessons (
	userId LONG not null,
	lessonId LONG not null,
	primary key (userId, lessonId)
);

create table nyyou_Keywords (
	id_ LONG not null primary key IDENTITY,
	companyId LONG,
	groupId LONG,
	keyword VARCHAR(1000) null,
	description TEXT null,
	createdDate DATE null,
	createdBy LONG,
	updatedDate DATE null,
	updatedBy LONG
);

create table nyyou_KeywordsCollaboration (
	id_ LONG not null primary key IDENTITY,
	companyId LONG,
	groupId LONG,
	keywordId LONG,
	keywordName VARCHAR(1000) null,
	userId LONG,
	userName VARCHAR(1000) null,
	status VARCHAR(75) null,
	createdDate DATE null,
	modifiedDate DATE null,
	markAs VARCHAR(75) null
);

create table nyyou_Lesson (
	uuid_ VARCHAR(75) null,
	lessonId LONG not null primary key IDENTITY,
	companyId LONG,
	groupId LONG,
	lessonName STRING null,
	description STRING null,
	author LONG,
	courseId VARCHAR(75) null,
	appreciatedUserIds TEXT null,
	appreciateCount INTEGER,
	uploadedTime DATE null,
	uploadedById LONG,
	uploadedByName VARCHAR(75) null,
	lessonNote TEXT null,
	status VARCHAR(75) null,
	requestLessonId LONG,
	lessonPrivacy VARCHAR(75) null,
	featured_ BOOLEAN,
	creator STRING null,
	secondaryAuthor VARCHAR(75) null,
	createDate DATE null,
	createBy LONG,
	updatedDate DATE null,
	updatedBy LONG,
	permission VARCHAR(75) null,
	markedAs VARCHAR(75) null,
	markedBy LONG,
	markedContent VARCHAR(500) null,
	currentAuthor LONG,
	shareWithProfile LONG,
	publishWithProfile LONG,
	publishedProfile VARCHAR(75) null,
	version DOUBLE,
	lessonStatus INTEGER,
	statusByUserId LONG,
	statusDate DATE null
);

create table nyyou_LessonCollaboration (
	id_ LONG not null primary key IDENTITY,
	lessonId LONG,
	userId LONG,
	memberStatus VARCHAR(75) null,
	type_ VARCHAR(75) null,
	accessPermission VARCHAR(75) null
);

create table nyyou_LessonObjectives (
	id_ LONG not null primary key IDENTITY,
	lessonId LONG,
	objective STRING null,
	modifiedDate DATE null
);

create table nyyou_Lesson_Usergroups (
	lessonId LONG not null,
	groupId LONG not null,
	primary key (lessonId, groupId)
);

create table nyyou_NYUUserGroup (
	uuid_ VARCHAR(75) null,
	userGroupId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	groupPrivacy VARCHAR(75) null,
	appreciatedUserIds TEXT null,
	appreciateCount LONG,
	createdDate DATE null,
	createdBy LONG,
	updatedDate DATE null,
	updatedBy LONG,
	administrators TEXT null,
	about STRING null,
	title STRING null,
	status INTEGER,
	statusByUserId LONG,
	statusDate DATE null
);

create table nyyou_RequestLesson (
	requestLessonId LONG not null primary key IDENTITY,
	companyId LONG,
	groupId LONG,
	name VARCHAR(1000) null,
	description STRING null,
	relatedLink VARCHAR(75) null,
	priority BOOLEAN,
	createdBy LONG,
	createdDate DATE null,
	acceptedBy LONG,
	status VARCHAR(75) null,
	appreciatedUserIds TEXT null,
	lastActivity DATE null,
	acceptedNote STRING null,
	answerType VARCHAR(75) null,
	sendTo LONG,
	opnionSurveyLink VARCHAR(75) null,
	surveyOptions TEXT null
);

create table nyyou_Slides (
	id_ LONG not null primary key IDENTITY,
	description TEXT null,
	descPosition VARCHAR(75) null,
	imageLink VARCHAR(75) null,
	createdDate DATE null,
	createdBy LONG,
	updatedDate DATE null,
	updatedBy LONG
);

create table nyyou_UserBadges (
	userBadgeId LONG not null primary key IDENTITY,
	userId LONG,
	badgeId LONG,
	badgeUrl VARCHAR(75) null,
	createdDate DATE null
);

create table nyyou_UserGroupRequest (
	id_ LONG not null primary key,
	userGroupId LONG,
	companyId LONG,
	groupId LONG,
	userGroupOwner LONG,
	requestDate DATE null,
	requestedBy LONG,
	status VARCHAR(75) null
);