USE [M04G2]
GO

/****** Object:  Table [dbo].[userInfo]    Script Date: 30/04/2019 11:59:44 SA ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[userInfo](
	[user_id] [int] IDENTITY(1,1) NOT NULL,
	[fullname] [nvarchar](50) NOT NULL,
	[birthday] [date] NOT NULL,
	[sex] [nvarchar](10) NOT NULL,
	[address] [nvarchar](50) NOT NULL,
	[email] [nvarchar](50) NOT NULL,
	[phonenumber] [nvarchar](20) NULL,
	[secretquestion] [nvarchar](30) NOT NULL,
	[secretanswer] [nvarchar](30) NOT NULL,
	[comment] [nvarchar](100) NULL,
 CONSTRAINT [PK_userInfo] PRIMARY KEY CLUSTERED 
(
	[user_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[userInfo] SET (LOCK_ESCALATION = DISABLE)
GO