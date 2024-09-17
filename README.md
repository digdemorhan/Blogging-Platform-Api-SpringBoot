# BLOGGING-PLATFORM-API-USING-SPRINGBOOT
# Projenin Ana Teması
Bu Blogging Platform API projesi, Spring Boot kullanılarak geliştirilmiş bir API olup blog gönderilerini yönetmeyi amaçlar. Aşağıda proje kurulumu, dosya yapısı ve API endpoint'lerine dair detaylı bilgileri bulabilirsiniz.
# Proje Özeti
<ul>
<li>Blog Gönderisi Ekleme: Yeni blog gönderileri oluşturabilirsiniz.</li>
<li>Blog Gönderisi Silme: Mevcut bir blog gönderisini ID'sine göre silebilirsiniz.</li>
<li>Tüm Blogları Listeleme: Tüm blog gönderilerini listeleyebilirsiniz.</li>
<li>Spring Data JPA: Veritabanı işlemlerini kolaylaştıran ve soyutlayan bir katman sunmaktadır.</li>
<li>ID ile Blog Arama: ID’ye göre belirli bir blog gönderisini bulabilirsiniz.</li>
</ul>

# Kullanılan Teknolojiler
<ul>
  <li>Java</li>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>Model Mapper</li>
  <li>H2-Database</li>
  <li>Maven ile Proje Yönetimi</li>
</ul>

# Projenin Temel Dosya Yapısı
![Ekran Alıntısı](https://github.com/user-attachments/assets/780fdedd-3bd0-4a9e-9234-a4f8c48f5005)
<ul>
  <li>config: Nesne haritalama için yapılandırma sınıfını (ModelMapperConfig) içerir.</li>
  <li>controller: API endpoint'lerinin tanımlandığı BlogController sınıfını içerir.</li>
  <li>dto: Veri transfer nesneleri (DTO) için kullanılan sınıfları içerir (BlogDto).</li>
  <li>entity: Entity sınıflarını içerir (örn. Blog, BaseEntity).</li>
  <li>repository: Veritabanı işlemleri için kullanılan arayüzü içerir (IBlogRepository).</li>
  <li>service: İş mantığı ve servis katmanı sınıflarını içerir (BlogService, BlogServiceImpl).</li>
</ul>

----
----
# Main Theme of the Project
This Blogging Platform API project is an API developed using Spring Boot and aims to manage blog posts. Below you can find detailed information about the project setup, file structure and API endpoints.
# Project Summary
<ul>
<li>Add Blog Post: You can create new blog posts.</li>
<li>Delete Blog Post: You can delete an existing blog post by its ID.</li>
<li>List All Blogs: You can list all blog posts.</li>
<li>Spring Data JPA: Provides a layer that facilitates and abstracts database operations.</li>
<li>Blog Search by ID: Find a specific blog post by ID.</li>
</ul>

# Technologies Used
<ul>
  <li>Java</li>
  <li>Spring Boot</li>
  <li>Spring Data JPA</li>
  <li>Model Mapper</li>
  <li>H2-Database</li>
  <li>Project Management with Maven</li>
</ul>

# Projenin Temel Dosya Yapısı
![Ekran Alıntısı](https://github.com/user-attachments/assets/780fdedd-3bd0-4a9e-9234-a4f8c48f5005)
<ul>
  <li>config: Contains the configuration class for object mapping (ModelMapperConfig).</li>
  <li>controller: Contains the BlogController class where API endpoints are defined.</li>
  <li>dto: Includes classes used for data transfer objects (DTO) (BlogDto).</li>
  <li>entity:Includes Entity classes (Blog and BaseEntity).</li>
  <li>repository: Contains the interface used for database operations (IBlogRepository).</li>
  <li>service: Includes business logic and service layer classes (BlogService, BlogServiceImpl).</li>
</ul>
