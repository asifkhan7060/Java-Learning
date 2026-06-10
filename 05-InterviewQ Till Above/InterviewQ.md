# Complete Java Interview Questions Revision (Collected So Far)

---

# 01. Java Introduction, JDK, JRE, JVM

### Basic

1. What is Java?
2. Why is Java platform independent?
3. What is WORA (Write Once Run Anywhere)?
4. Who developed Java?
5. What was Java originally called?
6. What is Java SE?
7. What is Java EE (Jakarta EE)?
8. What is Java ME?

### Intermediate

9. What is JVM?
10. What is JRE?
11. What is JDK?
12. Difference between JVM and JRE?
13. Difference between JRE and JDK?
14. Can Java run without JVM?
15. What is Bytecode?

### Advanced

16. Explain Java execution flow.
17. How does JVM execute Bytecode?
18. Why is Java considered platform independent?
19. What are the components of JVM?
20. Explain Class Loader in JVM.

---

# 02. Evolution of Java

### Basic

21. What is Source File Mode?
22. Which Java version introduced Source File Mode?
23. What is Boilerplate Code?

### Intermediate

24. Difference between traditional execution and Source File Mode.
25. What happens internally when running:

```java
java Hello.java
```

26. Where is bytecode stored in Source File Mode?

### Advanced

27. Explain reduced main method syntax.
28. Can we write Java programs without a public class?
29. Advantages of Source File Mode.
30. Source File Mode vs Traditional Compilation.

---

# 03. Variables

### Basic

31. What is a Variable?
32. What is Variable Declaration?
33. What is Variable Initialization?
34. Difference between Declaration and Initialization.
35. What is Variable Reassignment?

### Intermediate

36. What is a Constant?
37. Why is the final keyword used?
38. Difference between Variable and Constant.
39. What happens if we modify a final variable?

### Advanced

40. Explain memory allocation of variables.
41. Difference between Local Variables and Instance Variables.
42. Why are variables called identifiers?
43. Explain Variable Lifecycle.

---

# 04. Variable Naming Rules

### Basic

44. What are Identifiers?
45. What are the rules for naming variables?
46. Can a variable start with a number?
47. Can variable names contain spaces?

### Intermediate

48. What is Case Sensitivity in Java?
49. Difference between:

```java
number
Number
```

50. Can Java keywords be used as variable names?
51. What is lowerCamelCase?

### Advanced

52. Why are naming conventions important?
53. Difference between Naming Rules and Naming Conventions.
54. Why are constants written in uppercase?
55. Explain valid and invalid identifiers.

---

# 05. Data Types

### Basic

56. What is a Data Type?
57. How many Primitive Data Types exist in Java?
58. Name all Primitive Data Types.
59. What are Non-Primitive Data Types?

### Intermediate

60. Difference between Primitive and Non-Primitive Data Types.
61. Size of int?
62. Size of long?
63. Difference between float and double?
64. Why is 'f' compulsory with float?

### Advanced

65. Explain Unicode characters.
66. What are default values of primitive data types?
67. Difference between char and String.
68. Why is char 2 bytes in Java?
69. Explain memory storage of primitive data types.

---

# 06. Decision Making Statements

### Basic

70. What is Decision Making in Java?
71. Why are Decision Making Statements needed?
72. What is an if statement?
73. What is an if-else statement?

### Intermediate

74. What is an else-if ladder?
75. What is Nested if?
76. What is a switch statement?
77. Difference between if-else and switch.

### Advanced

78. Explain modern switch expressions.
79. Difference between old switch and new switch syntax.
80. When should switch be preferred over if-else?
81. Can switch return a value?

---

# 07. Loops

### Basic

82. What is a Loop?
83. Why are loops used?
84. What is Iteration?

### Intermediate

85. Difference between for and while loop.
86. Difference between while and do-while loop.
87. Why does do-while execute at least once?

### Advanced

88. Explain loop execution flow.
89. What is an infinite loop?
90. Difference between traditional for loop and enhanced for loop.
91. When should for-each loop be used?

---

# 08. Jump Statements

### Basic

92. What is a Jump Statement?
93. What is break?
94. What is continue?

### Intermediate

95. Difference between break and continue.
96. Can break be used in switch?
97. Can continue be used in switch?

### Advanced

98. How does break affect loop execution?
99. How does continue affect loop execution?
100. Real-life use cases of break and continue.

---

# 09. Methods

### Basic

101. What is a Method?
102. Why are Methods used?
103. What is Method Reusability?
104. What is Method Calling?

### Intermediate

105. Difference between Method Declaration and Method Call.
106. What are Parameters?
107. What are Arguments?
108. Difference between Parameters and Arguments.
109. What is Return Type?

### Advanced

110. Difference between void and non-void methods.
111. Why is main() static?
112. Why use private methods?
113. Explain method execution flow.
114. Advantages of methods.

---

# 10. Operators

### Basic

115. What are Operators in Java?
116. What is an Operand?
117. How many categories of operators exist in Java?
118. Difference between = and ==?
119. What is Integer Division?

---

# Arithmetic Operators

120. What are Arithmetic Operators?
121. What does Modulus Operator (%) return?
122. Difference between Integer Division and Decimal Division.
123. Applications of Arithmetic Operators.

---

# Relational Operators

124. What are Relational Operators?
125. Why do Relational Operators return boolean values?
126. Difference between == and !=?
127. Applications of Relational Operators.

---

# Logical Operators

128. What are Logical Operators?
129. Difference between && and ||?
130. What is Logical NOT Operator?
131. What is Short Circuit Evaluation?

### Advanced

132. Difference between && and &.
133. Difference between || and |.
134. Explain Short Circuit Evaluation with examples.

---

# Assignment Operators

135. What are Assignment Operators?
136. What is += ?
137. What is -= ?
138. What is *= ?
139. What is /= ?
140. What is %= ?

---

# Unary Operators

141. What are Unary Operators?
142. Difference between Unary Plus and Unary Minus.
143. Difference between Increment and Decrement.

### Advanced

144. Difference between Pre Increment and Post Increment.
145. Difference between Pre Decrement and Post Decrement.
146. Explain execution flow of ++x and x++.

---

# Bitwise Operators

### Basic

147. What are Bitwise Operators?
148. Why are Bitwise Operators used?

### Intermediate

149. How does Bitwise AND work?
150. How does Bitwise OR work?
151. What is XOR?
152. What is Bitwise Complement?

### Advanced

153. Why does ~5 return -6?
154. Difference between >> and >>>?
155. Difference between Left Shift and Right Shift.
156. Applications of Bitwise Operators.
157. Explain 2's Complement Representation.

---

# Ternary Operator

### Basic

158. What is Ternary Operator?
159. What is the syntax of Ternary Operator?

### Intermediate

160. Difference between Ternary Operator and if-else.
161. Advantages of Ternary Operator.

### Advanced

162. Can Ternary Operators be nested?
163. When should Ternary be preferred over if-else?
164. How does Ternary Operator improve readability?

---

# Summary

| Topic | Questions |
|---------|---------:|
| Java Intro, JVM, JDK, JRE | 20 |
| Evolution of Java | 10 |
| Variables | 13 |
| Naming Rules | 12 |
| Data Types | 14 |
| Decision Making | 12 |
| Loops | 10 |
| Jump Statements | 9 |
| Methods | 14 |
| Operators | 50 |
| **Total** | **164** |


# 11. OOP (Object-Oriented Programming) Introduction

### Basic

165. What is OOP?
166. Why was OOP introduced?
167. What are the four pillars of OOP?
168. What is an Object?
169. What is a Class?

### Intermediate

170. Difference between Procedural Programming and OOP.
171. What are the advantages of OOP?
172. What is Reusability in OOP?
173. What is Modularity in OOP?
174. What is Maintainability?

### Advanced

175. Explain real-world modeling in OOP.
176. Why is Java called an Object-Oriented Language?
177. Is Java 100% Object-Oriented? Why?
178. Difference between Object-Based and Object-Oriented languages.

---

# 12. Class and Object

### Basic

179. What is a Class?
180. What is an Object?
181. Why do we need Classes?
182. Why do we need Objects?
183. What is an Instance?

### Intermediate

184. Difference between Class and Object.
185. How are Objects created in Java?
186. What does the new keyword do?
187. What is a Reference Variable?
188. Difference between Object and Reference Variable.

### Advanced

189. Explain memory allocation during object creation.
190. What happens internally when new is used?
191. Can multiple references point to the same object?
192. What is Garbage Collection?
193. When does an object become eligible for Garbage Collection?

---

# 13. Constructors

### Basic

194. What is a Constructor?
195. Why is a Constructor needed?
196. What is the difference between a Method and a Constructor?
197. What are the rules of a Constructor?

### Intermediate

198. What is a Default Constructor?
199. What is a Parameterized Constructor?
200. Can a Constructor be overloaded?
201. Can Constructors have return types?
202. Can Constructors be private?

### Advanced

203. What is Constructor Chaining?
204. What is the purpose of this()?
205. What is the purpose of super()?
206. What happens if no constructor is defined?
207. Explain Constructor Execution Flow.

---

# 14. Records

### Basic

208. What is a Record in Java?
209. Why were Records introduced?
210. In which Java version were Records introduced?

### Intermediate

211. Difference between Class and Record.
212. Are Record fields mutable?
213. Can Records have methods?
214. Can Records implement Interfaces?

### Advanced

215. Can Records extend Classes?
216. Why are Records immutable?
217. What methods are automatically generated in Records?
218. When should Records be preferred over Classes?

---

# 15. Encapsulation

### Basic

219. What is Encapsulation?
220. Why is Encapsulation important?
221. What is Data Hiding?
222. What are Getters?
223. What are Setters?

### Intermediate

224. Why are variables declared private?
225. Difference between Encapsulation and Data Hiding.
226. What happens if fields are public?
227. Can Encapsulation exist without Getters and Setters?

### Advanced

228. How does Encapsulation improve security?
229. How does Encapsulation improve maintainability?
230. Explain Encapsulation using a Bank Account example.
231. What are the advantages of Encapsulation?

---

# 16. Inheritance

### Basic

232. What is Inheritance?
233. Why is Inheritance used?
234. What is a Parent Class?
235. What is a Child Class?
236. What is code reusability?

### Intermediate

237. Difference between Parent and Child Class.
238. What does extends keyword do?
239. What members are inherited?
240. Can private members be inherited?
241. Why can't Child Classes access private members directly?

### Advanced

242. What is super()?
243. Why must super() be called when Parent has a parameterized constructor?
244. What is Method Overriding?
245. Difference between Method Overloading and Method Overriding.
246. Can Constructors be inherited?
247. Explain IS-A relationship.
248. Types of Inheritance supported in Java.
249. Why doesn't Java support Multiple Inheritance through Classes?

---

# 17. Polymorphism

### Basic

250. What is Polymorphism?
251. Why is Polymorphism needed?
252. How many types of Polymorphism exist in Java?

### Compile Time Polymorphism

253. What is Method Overloading?
254. Why is Method Overloading called Compile Time Polymorphism?
255. What are the rules of Method Overloading?
256. Can methods be overloaded based only on return type?
257. Can parameter names differentiate overloaded methods?

### Runtime Polymorphism

258. What is Method Overriding?
259. Why is Method Overriding called Runtime Polymorphism?
260. What is Dynamic Method Dispatch?

### Advanced

261. Difference between Overloading and Overriding.
262. Can static methods be overridden?
263. What is Upcasting?
264. Explain:

```java
Vehicle v = new Car();
```

265. Which method executes when Parent reference points to Child object?
266. How does JVM decide which overridden method to call?
267. Explain Runtime Binding.
268. Explain Compile Time Binding.

---

# 18. Abstraction

### Basic

269. What is Abstraction?
270. Why is Abstraction used?
271. Difference between Abstraction and Encapsulation.

### Abstract Classes

272. What is an Abstract Class?
273. Can we create objects of Abstract Classes?
274. What is an Abstract Method?
275. Why must Child Classes implement Abstract Methods?

### Intermediate

276. Can an Abstract Class contain normal methods?
277. Can an Abstract Class contain Constructors?
278. Why would an Abstract Class need a Constructor?
279. Can an Abstract Class have instance variables?

### Advanced

280. Difference between Abstract Class and Interface.
281. When should Abstract Class be used?
282. Can an Abstract Class contain both abstract and concrete methods?
283. What happens if Child Class does not implement all abstract methods?

---

# 19. Interface

### Basic

284. What is an Interface?
285. Why are Interfaces used?
286. What is a Contract in Java?
287. Difference between Interface and Class.

### Intermediate

288. Difference between Interface and Abstract Class.
289. Can Interfaces contain variables?
290. Are Interface variables public static final by default?
291. Can Interfaces contain methods with implementation?

### Default Methods

292. What is a Default Method?
293. Why were Default Methods introduced?
294. Can Default Methods be overridden?

### Advanced

295. Can an Interface extend another Interface?
296. Can a Class implement multiple Interfaces?
297. Why does Java support Multiple Inheritance through Interfaces?
298. Explain Interface Polymorphism.
299. Explain:

```java
CarControls car = new ElectricCar();
```

300. Which methods are accessible through Interface Reference?
301. Difference between extends and implements.

---

# 20. Marker Interface

### Basic

302. What is a Marker Interface?
303. Why is it called a Marker Interface?
304. Does a Marker Interface contain methods?

### Intermediate

305. What is Serializable?
306. What is Cloneable?
307. What is Remote Interface?
308. What is Serialization?
309. What is Deserialization?

### Advanced

310. Why doesn't Serializable contain methods?
311. How does Java identify Marker Interfaces?
312. Difference between Marker Interface and Normal Interface.
313. Difference between Marker Interface and Annotations.
314. Can Marker Interfaces participate in Multiple Inheritance?
315. Explain serialization flow in Java.

---

# OOPs Total Added

| Topic | Questions |
|---------|---------:|
| OOP Introduction | 14 |
| Class & Object | 15 |
| Constructors | 14 |
| Records | 11 |
| Encapsulation | 13 |
| Inheritance | 18 |
| Polymorphism | 19 |
| Abstraction | 15 |
| Interface | 18 |
| Marker Interface | 14 |
| **Total Added** | **151** |

---

# Grand Total

```text
Previous Questions = 164
OOP Questions = 151

-------------------------
Total Questions = 315
```