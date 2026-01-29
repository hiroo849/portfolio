CREATE TABLE job_applications (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  company_name VARCHAR(255),
  site_name VARCHAR(255),
  applied_date DATE,
  status VARCHAR(50),
  memo VARCHAR(255),
  created_at TIMESTAMP,
  updated_at TIMESTAMP
);
