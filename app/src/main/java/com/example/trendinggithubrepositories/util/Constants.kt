package com.androiddevs.mvvmnewsapp.util

class Constants {
    companion object {
        val FAKE_RESPONSE = "[\n" +
                "  {\n" +
                "    \"id\": 417862,\n" +
                "    \"node_id\": \"MDEwOlJlcG9zaXRvcnk0MTc4NjI=\",\n" +
                "    \"name\": \"octokit.rb\",\n" +
                "    \"full_name\": \"octokit/octokit.rb\",\n" +
                "    \"private\": false,\n" +
                "    \"owner\": {\n" +
                "      \"login\": \"octokit\",\n" +
                "      \"id\": 3430433,\n" +
                "      \"node_id\": \"MDEyOk9yZ2FuaXphdGlvbjM0MzA0MzM=\",\n" +
                "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/3430433?v=4\",\n" +
                "      \"gravatar_id\": \"\",\n" +
                "      \"url\": \"https://api.github.com/users/octokit\",\n" +
                "      \"html_url\": \"https://github.com/octokit\",\n" +
                "      \"followers_url\": \"https://api.github.com/users/octokit/followers\",\n" +
                "      \"following_url\": \"https://api.github.com/users/octokit/following{/other_user}\",\n" +
                "      \"gists_url\": \"https://api.github.com/users/octokit/gists{/gist_id}\",\n" +
                "      \"starred_url\": \"https://api.github.com/users/octokit/starred{/owner}{/repo}\",\n" +
                "      \"subscriptions_url\": \"https://api.github.com/users/octokit/subscriptions\",\n" +
                "      \"organizations_url\": \"https://api.github.com/users/octokit/orgs\",\n" +
                "      \"repos_url\": \"https://api.github.com/users/octokit/repos\",\n" +
                "      \"events_url\": \"https://api.github.com/users/octokit/events{/privacy}\",\n" +
                "      \"received_events_url\": \"https://api.github.com/users/octokit/received_events\",\n" +
                "      \"type\": \"Organization\",\n" +
                "      \"site_admin\": false\n" +
                "    },\n" +
                "    \"html_url\": \"https://github.com/octokit/octokit.rb\",\n" +
                "    \"description\": \"Ruby toolkit for the GitHub API\",\n" +
                "    \"fork\": false,\n" +
                "    \"url\": \"https://api.github.com/repos/octokit/octokit.rb\",\n" +
                "    \"forks_url\": \"https://api.github.com/repos/octokit/octokit.rb/forks\",\n" +
                "    \"keys_url\": \"https://api.github.com/repos/octokit/octokit.rb/keys{/key_id}\",\n" +
                "    \"collaborators_url\": \"https://api.github.com/repos/octokit/octokit.rb/collaborators{/collaborator}\",\n" +
                "    \"teams_url\": \"https://api.github.com/repos/octokit/octokit.rb/teams\",\n" +
                "    \"hooks_url\": \"https://api.github.com/repos/octokit/octokit.rb/hooks\",\n" +
                "    \"issue_events_url\": \"https://api.github.com/repos/octokit/octokit.rb/issues/events{/number}\",\n" +
                "    \"events_url\": \"https://api.github.com/repos/octokit/octokit.rb/events\",\n" +
                "    \"assignees_url\": \"https://api.github.com/repos/octokit/octokit.rb/assignees{/user}\",\n" +
                "    \"branches_url\": \"https://api.github.com/repos/octokit/octokit.rb/branches{/branch}\",\n" +
                "    \"tags_url\": \"https://api.github.com/repos/octokit/octokit.rb/tags\",\n" +
                "    \"blobs_url\": \"https://api.github.com/repos/octokit/octokit.rb/git/blobs{/sha}\",\n" +
                "    \"git_tags_url\": \"https://api.github.com/repos/octokit/octokit.rb/git/tags{/sha}\",\n" +
                "    \"git_refs_url\": \"https://api.github.com/repos/octokit/octokit.rb/git/refs{/sha}\",\n" +
                "    \"trees_url\": \"https://api.github.com/repos/octokit/octokit.rb/git/trees{/sha}\",\n" +
                "    \"statuses_url\": \"https://api.github.com/repos/octokit/octokit.rb/statuses/{sha}\",\n" +
                "    \"languages_url\": \"https://api.github.com/repos/octokit/octokit.rb/languages\",\n" +
                "    \"stargazers_url\": \"https://api.github.com/repos/octokit/octokit.rb/stargazers\",\n" +
                "    \"contributors_url\": \"https://api.github.com/repos/octokit/octokit.rb/contributors\",\n" +
                "    \"subscribers_url\": \"https://api.github.com/repos/octokit/octokit.rb/subscribers\",\n" +
                "    \"subscription_url\": \"https://api.github.com/repos/octokit/octokit.rb/subscription\",\n" +
                "    \"commits_url\": \"https://api.github.com/repos/octokit/octokit.rb/commits{/sha}\",\n" +
                "    \"git_commits_url\": \"https://api.github.com/repos/octokit/octokit.rb/git/commits{/sha}\",\n" +
                "    \"comments_url\": \"https://api.github.com/repos/octokit/octokit.rb/comments{/number}\",\n" +
                "    \"issue_comment_url\": \"https://api.github.com/repos/octokit/octokit.rb/issues/comments{/number}\",\n" +
                "    \"contents_url\": \"https://api.github.com/repos/octokit/octokit.rb/contents/{+path}\",\n" +
                "    \"compare_url\": \"https://api.github.com/repos/octokit/octokit.rb/compare/{base}...{head}\",\n" +
                "    \"merges_url\": \"https://api.github.com/repos/octokit/octokit.rb/merges\",\n" +
                "    \"archive_url\": \"https://api.github.com/repos/octokit/octokit.rb/{archive_format}{/ref}\",\n" +
                "    \"downloads_url\": \"https://api.github.com/repos/octokit/octokit.rb/downloads\",\n" +
                "    \"issues_url\": \"https://api.github.com/repos/octokit/octokit.rb/issues{/number}\",\n" +
                "    \"pulls_url\": \"https://api.github.com/repos/octokit/octokit.rb/pulls{/number}\",\n" +
                "    \"milestones_url\": \"https://api.github.com/repos/octokit/octokit.rb/milestones{/number}\",\n" +
                "    \"notifications_url\": \"https://api.github.com/repos/octokit/octokit.rb/notifications{?since,all,participating}\",\n" +
                "    \"labels_url\": \"https://api.github.com/repos/octokit/octokit.rb/labels{/name}\",\n" +
                "    \"releases_url\": \"https://api.github.com/repos/octokit/octokit.rb/releases{/id}\",\n" +
                "    \"deployments_url\": \"https://api.github.com/repos/octokit/octokit.rb/deployments\",\n" +
                "    \"created_at\": \"2009-12-10T21:41:49Z\",\n" +
                "    \"updated_at\": \"2022-02-26T06:27:27Z\",\n" +
                "    \"pushed_at\": \"2022-02-23T13:54:48Z\",\n" +
                "    \"git_url\": \"git://github.com/octokit/octokit.rb.git\",\n" +
                "    \"ssh_url\": \"git@github.com:octokit/octokit.rb.git\",\n" +
                "    \"clone_url\": \"https://github.com/octokit/octokit.rb.git\",\n" +
                "    \"svn_url\": \"https://github.com/octokit/octokit.rb\",\n" +
                "    \"homepage\": \"http://octokit.github.io/octokit.rb/\",\n" +
                "    \"size\": 16696,\n" +
                "    \"stargazers_count\": 3553,\n" +
                "    \"watchers_count\": 3553,\n" +
                "    \"language\": \"Ruby\",\n" +
                "    \"has_issues\": true,\n" +
                "    \"has_projects\": true,\n" +
                "    \"has_downloads\": true,\n" +
                "    \"has_wiki\": false,\n" +
                "    \"has_pages\": true,\n" +
                "    \"forks_count\": 1205,\n" +
                "    \"mirror_url\": null,\n" +
                "    \"archived\": false,\n" +
                "    \"disabled\": false,\n" +
                "    \"open_issues_count\": 75,\n" +
                "    \"license\": {\n" +
                "      \"key\": \"mit\",\n" +
                "      \"name\": \"MIT License\",\n" +
                "      \"spdx_id\": \"MIT\",\n" +
                "      \"url\": \"https://api.github.com/licenses/mit\",\n" +
                "      \"node_id\": \"MDc6TGljZW5zZTEz\"\n" +
                "    },\n" +
                "    \"allow_forking\": true,\n" +
                "    \"is_template\": false,\n" +
                "    \"topics\": [\n" +
                "      \"github\",\n" +
                "      \"github-api\",\n" +
                "      \"octokit\"\n" +
                "    ],\n" +
                "    \"visibility\": \"public\",\n" +
                "    \"forks\": 1205,\n" +
                "    \"open_issues\": 75,\n" +
                "    \"watchers\": 3553,\n" +
                "    \"default_branch\": \"4-stable\",\n" +
                "    \"permissions\": {\n" +
                "      \"admin\": false,\n" +
                "      \"maintain\": false,\n" +
                "      \"push\": false,\n" +
                "      \"triage\": false,\n" +
                "      \"pull\": true\n" +
                "    }\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": 711976,\n" +
                "    \"node_id\": \"MDEwOlJlcG9zaXRvcnk3MTE5NzY=\",\n" +
                "    \"name\": \"octokit.js\",\n" +
                "    \"full_name\": \"octokit/octokit.js\",\n" +
                "    \"private\": false,\n" +
                "    \"owner\": {\n" +
                "      \"login\": \"octokit\",\n" +
                "      \"id\": 3430433,\n" +
                "      \"node_id\": \"MDEyOk9yZ2FuaXphdGlvbjM0MzA0MzM=\",\n" +
                "      \"avatar_url\": \"https://avatars.githubusercontent.com/u/3430433?v=4\",\n" +
                "      \"gravatar_id\": \"\",\n" +
                "      \"url\": \"https://api.github.com/users/octokit\",\n" +
                "      \"html_url\": \"https://github.com/octokit\",\n" +
                "      \"followers_url\": \"https://api.github.com/users/octokit/followers\",\n" +
                "      \"following_url\": \"https://api.github.com/users/octokit/following{/other_user}\",\n" +
                "      \"gists_url\": \"https://api.github.com/users/octokit/gists{/gist_id}\",\n" +
                "      \"starred_url\": \"https://api.github.com/users/octokit/starred{/owner}{/repo}\",\n" +
                "      \"subscriptions_url\": \"https://api.github.com/users/octokit/subscriptions\",\n" +
                "      \"organizations_url\": \"https://api.github.com/users/octokit/orgs\",\n" +
                "      \"repos_url\": \"https://api.github.com/users/octokit/repos\",\n" +
                "      \"events_url\": \"https://api.github.com/users/octokit/events{/privacy}\",\n" +
                "      \"received_events_url\": \"https://api.github.com/users/octokit/received_events\",\n" +
                "      \"type\": \"Organization\",\n" +
                "      \"site_admin\": false\n" +
                "    },\n" +
                "    \"html_url\": \"https://github.com/octokit/octokit.js\",\n" +
                "    \"description\": \"The all-batteries-included GitHub SDK for Browsers, Node.js, and Deno.\",\n" +
                "    \"fork\": false,\n" +
                "    \"url\": \"https://api.github.com/repos/octokit/octokit.js\",\n" +
                "    \"forks_url\": \"https://api.github.com/repos/octokit/octokit.js/forks\",\n" +
                "    \"keys_url\": \"https://api.github.com/repos/octokit/octokit.js/keys{/key_id}\",\n" +
                "    \"collaborators_url\": \"https://api.github.com/repos/octokit/octokit.js/collaborators{/collaborator}\",\n" +
                "    \"teams_url\": \"https://api.github.com/repos/octokit/octokit.js/teams\",\n" +
                "    \"hooks_url\": \"https://api.github.com/repos/octokit/octokit.js/hooks\",\n" +
                "    \"issue_events_url\": \"https://api.github.com/repos/octokit/octokit.js/issues/events{/number}\",\n" +
                "    \"events_url\": \"https://api.github.com/repos/octokit/octokit.js/events\",\n" +
                "    \"assignees_url\": \"https://api.github.com/repos/octokit/octokit.js/assignees{/user}\",\n" +
                "    \"branches_url\": \"https://api.github.com/repos/octokit/octokit.js/branches{/branch}\",\n" +
                "    \"tags_url\": \"https://api.github.com/repos/octokit/octokit.js/tags\",\n" +
                "    \"blobs_url\": \"https://api.github.com/repos/octokit/octokit.js/git/blobs{/sha}\",\n" +
                "    \"git_tags_url\": \"https://api.github.com/repos/octokit/octokit.js/git/tags{/sha}\",\n" +
                "    \"git_refs_url\": \"https://api.github.com/repos/octokit/octokit.js/git/refs{/sha}\",\n" +
                "    \"trees_url\": \"https://api.github.com/repos/octokit/octokit.js/git/trees{/sha}\",\n" +
                "    \"statuses_url\": \"https://api.github.com/repos/octokit/octokit.js/statuses/{sha}\",\n" +
                "    \"languages_url\": \"https://api.github.com/repos/octokit/octokit.js/languages\",\n" +
                "    \"stargazers_url\": \"https://api.github.com/repos/octokit/octokit.js/stargazers\",\n" +
                "    \"contributors_url\": \"https://api.github.com/repos/octokit/octokit.js/contributors\",\n" +
                "    \"subscribers_url\": \"https://api.github.com/repos/octokit/octokit.js/subscribers\",\n" +
                "    \"subscription_url\": \"https://api.github.com/repos/octokit/octokit.js/subscription\",\n" +
                "    \"commits_url\": \"https://api.github.com/repos/octokit/octokit.js/commits{/sha}\",\n" +
                "    \"git_commits_url\": \"https://api.github.com/repos/octokit/octokit.js/git/commits{/sha}\",\n" +
                "    \"comments_url\": \"https://api.github.com/repos/octokit/octokit.js/comments{/number}\",\n" +
                "    \"issue_comment_url\": \"https://api.github.com/repos/octokit/octokit.js/issues/comments{/number}\",\n" +
                "    \"contents_url\": \"https://api.github.com/repos/octokit/octokit.js/contents/{+path}\",\n" +
                "    \"compare_url\": \"https://api.github.com/repos/octokit/octokit.js/compare/{base}...{head}\",\n" +
                "    \"merges_url\": \"https://api.github.com/repos/octokit/octokit.js/merges\",\n" +
                "    \"archive_url\": \"https://api.github.com/repos/octokit/octokit.js/{archive_format}{/ref}\",\n" +
                "    \"downloads_url\": \"https://api.github.com/repos/octokit/octokit.js/downloads\",\n" +
                "    \"issues_url\": \"https://api.github.com/repos/octokit/octokit.js/issues{/number}\",\n" +
                "    \"pulls_url\": \"https://api.github.com/repos/octokit/octokit.js/pulls{/number}\",\n" +
                "    \"milestones_url\": \"https://api.github.com/repos/octokit/octokit.js/milestones{/number}\",\n" +
                "    \"notifications_url\": \"https://api.github.com/repos/octokit/octokit.js/notifications{?since,all,participating}\",\n" +
                "    \"labels_url\": \"https://api.github.com/repos/octokit/octokit.js/labels{/name}\",\n" +
                "    \"releases_url\": \"https://api.github.com/repos/octokit/octokit.js/releases{/id}\",\n" +
                "    \"deployments_url\": \"https://api.github.com/repos/octokit/octokit.js/deployments\",\n" +
                "    \"created_at\": \"2010-06-09T17:07:03Z\",\n" +
                "    \"updated_at\": \"2022-02-26T06:27:28Z\",\n" +
                "    \"pushed_at\": \"2022-01-22T22:33:19Z\",\n" +
                "    \"git_url\": \"git://github.com/octokit/octokit.js.git\",\n" +
                "    \"ssh_url\": \"git@github.com:octokit/octokit.js.git\",\n" +
                "    \"clone_url\": \"https://github.com/octokit/octokit.js.git\",\n" +
                "    \"svn_url\": \"https://github.com/octokit/octokit.js\",\n" +
                "    \"homepage\": \"\",\n" +
                "    \"size\": 12269,\n" +
                "    \"stargazers_count\": 5308,\n" +
                "    \"watchers_count\": 5308,\n" +
                "    \"language\": \"TypeScript\",\n" +
                "    \"has_issues\": true,\n" +
                "    \"has_projects\": false,\n" +
                "    \"has_downloads\": true,\n" +
                "    \"has_wiki\": false,\n" +
                "    \"has_pages\": true,\n" +
                "    \"forks_count\": 993,\n" +
                "    \"mirror_url\": null,\n" +
                "    \"archived\": false,\n" +
                "    \"disabled\": false,\n" +
                "    \"open_issues_count\": 18,\n" +
                "    \"license\": {\n" +
                "      \"key\": \"mit\",\n" +
                "      \"name\": \"MIT License\",\n" +
                "      \"spdx_id\": \"MIT\",\n" +
                "      \"url\": \"https://api.github.com/licenses/mit\",\n" +
                "      \"node_id\": \"MDc6TGljZW5zZTEz\"\n" +
                "    },\n" +
                "    \"allow_forking\": true,\n" +
                "    \"is_template\": false,\n" +
                "    \"topics\": [\n" +
                "      \"github\",\n" +
                "      \"javascript\",\n" +
                "      \"octokit\",\n" +
                "      \"rest\"\n" +
                "    ],\n" +
                "    \"visibility\": \"public\",\n" +
                "    \"forks\": 993,\n" +
                "    \"open_issues\": 18,\n" +
                "    \"watchers\": 5308,\n" +
                "    \"default_branch\": \"main\",\n" +
                "    \"permissions\": {\n" +
                "      \"admin\": false,\n" +
                "      \"maintain\": false,\n" +
                "      \"push\": false,\n" +
                "      \"triage\": false,\n" +
                "      \"pull\": true\n" +
                "    }\n" +
                "  }\n" +
                "]"
        const val BASE_URL = "https://api.github.com/"
        const val SEARCH_NEWS_TIME_DELAY = 500L
        const val QUERY_PAGE_SIZE = 20
        const val FIVE_MINUTES = 1 * 60 * 1000
        const val ONE_TWENTY_MINUTES = 120 * 60 * 1000
    }
}