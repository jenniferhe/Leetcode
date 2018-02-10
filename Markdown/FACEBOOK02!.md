### FACEBOOK!

- LEETCODE 部分

  - 133  Clone Graph 与原题不一样的是输入不是一个Node *, 而是vector<Node*>， 需要clone这个vector里的所有 nodes。

    问面试官所有的nodes 是否fully connected 他说什么情况都有可能

    但是是给一堆点，然后clone，不能有duplicate。

  - 140 Word breakII 只返回一种结果，算worst time complexity。   follow up  减枝优化

  - 146 LRU Cache

  - 252,253 比如[[1,2], [2,3], [3,4]]要返回2，[[1,1], [1,1], [1,1]]要返回3。
    先说思路，复杂度，然后再写，再跑testcase，真的run不是口头跑。

    ????Task Scheduler默认first in first serve，意思是给一个task id序列和一个cooldown时间，返回一共需要多长时间完成这些tasks。每个task默认话费1个time unit。
    例子：tasks = [1,1,2,1], cooldown = 2, 需要1 -> idle -> idle -> 1 -> 2 -> idle -> 1，所以返回7。这题也是没完全做完，跪的第二个点


  - 304

  - 311 Sparse Matrix multiplication/sparse vector dot product

  - 314

  - 341 不同的是不要实现iterator, 给出input的例子, 自己可以设计一个结构, 也可以用builtin来表示这个input. 实在想不出有什么数据结构可以hold: [1, 2, [], [[[3, [[4]], 7]]]], 这样的输入, 就参照了立德口德定义的, 还好没有叫实现, 就只写了interface.

  - 350  数组已经sorted了，先用的two pointer写的，问了时空复杂度，test cases
       follow up: 如果两个数组中有一个数组特别长，怎么办，答 binary search，问了具体怎么用binary search来实现，然后要求写binary search 找lower bound 每一问都问了时间复杂度，空间复杂度，列test case，口头跑其中一个test case

  - 348

  - 415 ad

  - 523

  - 560

  - 621 类似：task scheduler 但要保持原本order

    - 我想了想，用我之前的方法，先找最多task，完后用最多task定frame的方法就不灵了。。。 但是我还是说了一下，心想后来定好frame，再往里插的时候，会不会有什么保持order的方法。。。 小哥直接打断我，说我知道你在说什么，你说的那是这道题的另外一个version。。。有经验啊。。。 我这一般遇到新题，就会紧张，紧张的话，我的思路就很难平复。。。结果绕来绕去的。。。 我好不容易想出来想法，用一个stringbuilder（其实我觉得用arraylist也可以）来build结果。。。 用一个hashmap来存每个元素的count，key是task，value是count。。。 做一个loop，每走一步，check task[i] 是否在hashmap中，如果在，check value，可以的话，就ok，并reset value to 0。不可以的话，加 “ ”补位。。。 不在的话，放一个新的key value pair进去。。。 然后我想了想，这应该也是一个optimal的solution，space应该不会加多。。。 可是最后就写了这一道题。。。而且还有bug。。。 心已经碎了。。。 
    - 高频题 task scheduler
      basic version: don't allow reordering of tasks. (hashmap). 鐗涗汉浜戦泦,涓€浜╀笁鍒嗗湴
      follow up: allow reordering of tasks. (priority queue, greedy)
      complexity analysis

  - 给一个质数数组（无重复），输出数组元素所有可能的乘积

    ​

- 其他

  - isValidBST

  - 链表找环 （要求O(1)空间、不破坏链表结构，时间复杂度best case O(1N)，双指针的方法best case是O(1.5N)）

  - BST to sorted circular double LinkedList

  - 第二题是detect if a graph is Bipartite or not

  - 听口音应该是国人大哥，只有一道题，m*n matrix，每个坐标都有一个character，找到所有左上角到右下角的路径（只能向右向下走）并打印，比如a->b->c。 第一遍 String dfs秒了。followup优化用stringbuilder，秒了。followup再次优化用char[]，稍稍卡了几下（算index算的有点儿慢）

  - 给一个 words = ["a", "b", "c"], 一个 weights = [1, 2, 3] 然后写一个function按照对应的weight来生成 word
    比如如果生成600次，a 大致出现100次，b 大致200次， c大致300次
    做完之后他再让你生成n次再统计输出一下结果

    - https://stackoverflow.com/questions/6737283/weighted-randomness-in-java

  - 应该是一样的，套了个场景，想象一个接口: List<Integer> getFriend(int id). from: 1point3acres.com/bbs 

    两个list做intersection 求两个数组的公共元素那个题目

    用户id是用整数型的，又一个api是可以获得该用户的所有朋友id，如何得到用户a 和b之间的是几度好友需要coding，follow up，空间复杂度，如何优化memory。当时答的用BST和双向BST，跪了。

    **补充内容 (2017-9-2 15:35):**
    A->B->C->D 就说明AD是3度好友

  - 美国小哥哥上来二话不说 就是做题, 两道ez题目, 其实是一道了, 第二问是follow up; 题目是 给你一个 arr [6 3 5 7] 一个 target 8 找 连续subarr sum 等于target [3 5] 只需要返回true or false;第一问是 只含有postive num, 写完后 说 你怎么写unit test, 需要考虑哪些输入, 我就说 empty; Integer.MAX_VALUE; 我就继续说如果是这种情况我的code怎么改(其实就是把某些变量改成Long)
    第二问 如果可以含有 negative num 咋整, 我说 hashset 存sum 然后 每次 看看sum - target在不在 set里面了. 然后 叫我分析了两者的time space 复杂度 
    然后就是 我随便问了他两个问题 就结束了.


  -  longest arithmetic sequence 面经题 唯一和我看到的不同处是要求返回最长sequence
  - is palindrome
  - intersection of two arrays
    Follow: HashMap, Two pointers, what if one of the array is bigger than the other(这个最后没时间了 随便说了两句就问问题了)
  - 刚刚店面，一定挂了！
    1. 移0. 1point3acres.com/bbs
    2. 写一个random 输出城市名字的函数。给了一个城市的map，格式：城市名，人口数。根据城市人口数的比例，来输出城市名字。比如 map：DC 90， SF 50， LA 60，城市输出的概率分别是：90/200， 50/200， 60/200. 不停的掉用这个函数,按照概率来输出城市的名字. more info on 1point3acres.com
      第二题没写完！哎
  - 最喜欢的tech最自豪最challenging的project
    Your role preference? Front-end/back-end/database

  ​